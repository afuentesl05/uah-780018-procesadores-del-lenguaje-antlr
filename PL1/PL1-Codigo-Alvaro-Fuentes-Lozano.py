# PL1 – Máquina de estados genérica (DFA)
# Autor: [Álvaro Fuentes Lozano]
# Descripción: Implementación de una máquina de estados finitos determinista (DFA) genérica,
# con ejemplos de construcción y tokenización para distintos lenguajes formales.

from dataclasses import dataclass
from typing import Callable, Dict, List, Optional, Set, Tuple

@dataclass
class DFA:
    """
    Clase que representa una máquina de estados finitos determinista (DFA).
    """
    state_names: List[str]                # Nombres de los estados
    alphabet: List[str]                   # Alfabeto de símbolos
    transition: List[List[int]]           # Matriz de transiciones (índices de estados)
    start: int                            # Estado inicial (índice)
    accept: Set[int]                      # Conjunto de estados de aceptación (índices)

    def reset(self) -> int:
        """
        Reinicia la DFA al estado inicial.
        """
        return self.start

    def step(self, state: int, symbol_index: int) -> int:
        """
        Realiza una transición desde un estado dado con un símbolo dado.
        Devuelve el índice del siguiente estado o -1 si es una transición inválida.
        """
        if state < 0 or symbol_index < 0:
            return -1
        try:
            return self.transition[state][symbol_index]
        except IndexError:
            return -1

    def run(self, map_char_to_symbol_index: Callable[[str], int], text: str) -> Tuple[bool, List[Tuple[int, str, int]]]:
        """
        Ejecuta la DFA sobre una cadena de entrada, devolviendo si es aceptada y el trazo de estados.
        """
        state = self.reset()
        trace: List[Tuple[int, str, int]] = []
        for ch in text:
            sym_idx = map_char_to_symbol_index(ch)
            state2 = self.step(state, sym_idx)
            sym = self.alphabet[sym_idx] if sym_idx >= 0 else "<?>"
            trace.append((state, sym, state2))
            state = state2
            if state < 0:
                break
        return (state in self.accept, trace)

# ---------------- Helpers ----------------

def make_indexer(symbols: List[str]) -> Dict[str, int]:
    """
    Crea un diccionario que mapea cada símbolo a su índice en la lista.
    """
    return {s: i for i, s in enumerate(symbols)}

def mapper_from_rules(alphabet: List[str], rules: List[Tuple[Callable[[str], bool], str]]) -> Callable[[str], int]:
    """
    Genera una función que mapea caracteres a índices del alfabeto según reglas de predicados.
    """
    index = make_indexer(alphabet)
    def map_char(ch: str) -> int:
        for pred, lab in rules:
            if pred(ch):
                return index[lab]
        return -1
    return map_char

def longest_match(dfa, mapper, text, start=0):
    """
    Calcula la longitud del prefijo más largo aceptado por la DFA desde text[start:].
    """
    state = dfa.start
    best = -1
    i = start
    while i < len(text):
        sym_idx = mapper(text[i])
        state = dfa.step(state, sym_idx)
        if state < 0:
            break
        if state in dfa.accept:
            best = i
        i += 1
    return 0 if best < 0 else (best - start + 1)

# ----------- Predicados útiles -----------

is_digit = str.isdigit

def is_char(target: str):
    """
    Devuelve un predicado que verifica si un carácter es igual al objetivo.
    """
    return lambda ch: ch == target

def is_blank(ch: str) -> bool:
    """
    Verifica si un carácter es un espacio o tabulación.
    """
    return ch in {" ", "\\t"}

def is_letter(ch: str) -> bool:
    """
    Verifica si un carácter es una letra (mayúscula, minúscula o guion bajo).
    """
    return ("a" <= ch <= "z") or ("A" <= ch <= "Z") or ch == "_"

def is_minuscula(ch: str) -> bool:
    """
    Verifica si un carácter es una letra minúscula.
    """
    return "a" <= ch <= "z"

def is_mayuscula(ch: str) -> bool:
    """
    Verifica si un carácter es una letra mayúscula.
    """
    return "A" <= ch <= "Z"

def is_a(ch: str) -> bool:
    """
    Verifica si un carácter es 'a'.
    """
    return ch == "a"

def is_b(ch: str) -> bool:
    """
    Verifica si un carácter es 'b'.
    """
    return ch == "b"

# -------------- Builder --------------

def build_case_from_matrix(
    state_names: List[str],
    alphabet: List[str],
    matrix: List[List[int]],
    start_state_name: str,
    accept_state_names: List[str],
    rules,
):
    """
    Construye una DFA y su mapeador de caracteres a símbolos a partir de una matriz de transiciones y reglas.
    """
    name_to_idx = {n: i for i, n in enumerate(state_names)}
    start_idx = name_to_idx[start_state_name]
    accept_idx = {name_to_idx[n] for n in accept_state_names}
    dfa = DFA(state_names, alphabet, matrix, start_idx, accept_idx)
    mapper = mapper_from_rules(alphabet, rules)
    return dfa, mapper

# -------------- Ejemplo de DFA: Caso (a) --------------
def build_case_a():
    """
    Construye la DFA para el caso (a): identificadores (letras y dígitos).
    """
    names = ["A","CDEFG"]
    alph = ["m","M","D"] 
    matrix_a = [
        [1, 1, -1],
        [1, 1, 1]
    ]
    accept_names = ["CDEFG"]
    rules = [
        (is_minuscula, "m"),
        (is_mayuscula, "M"),
        (is_digit, "D"),
    ]
    return build_case_from_matrix(names, alph, matrix_a, "A", accept_names, rules)

# -------------- Ejemplo de DFA: Caso (b) --------------
def build_case_b(): 
    """
    Construye la DFA para el caso (b): cadenas sobre 'a' y 'b'.
    """
    names = ["AC","BE","DF"]
    alph = ["a","b"]
    matrix_b = [
        [1, 0],
        [2, 1],
        [1, 2]
    ]
    accept_names = ["AC","DF"]
    rules = [
        (is_a, "a"),
        (is_b, "b")
    ]
    return build_case_from_matrix(names, alph, matrix_b, "AC", accept_names, rules)
 
# -------------- Ejemplo de DFA: Caso (c) --------------
def build_case_c():
    """
    Construye la DFA para el caso (c): números (dígitos, punto y signo menos).
    """
    names = ["A","BE","D","F", "GH"]
    alph = ["p","d","m"]
    matrix_c = [
        [-1, 1, 2],
        [3, 1, -1],
        [-1, 1, -1],
        [-1, 4, -1],
        [-1, 4, -1]
    ]
    accept_names = ["BE", "GH"]
    rules = [
        (is_char("."), "p"),
        (is_digit, "d"),
        (is_char("-"), "m")
    ]
    return build_case_from_matrix(names, alph, matrix_c, "A", accept_names, rules)
   
# -------------- Ejemplo de DFA: Caso (d) --------------
def build_case_d(): 
    """
    Construye la DFA para el caso (d): expresiones con identificadores, números, operadores y blancos.
    Utiliza los mapeadores de los casos (a) y (c) para identificar identificadores y números.
    """
    names = ["E","FG","BCHI","AJ"]
    alph = ["b","i","m","n","s"]
    matrix_c = [
        [0, -1, 1, 0, 1],
        [3, 2, -1, 2, -1],
        [0, -1, 1, -1, 1],
        [-1, 2, -1, 2, -1]
    ]
    accept_names = ["BCHI"]
    # Reutiliza los mapeadores de los casos a y c
    _, identificador_mapper = build_case_a()
    _, numero_mapper = build_case_c()

    def is_identificador(ch: str) -> bool:
        """
        Verifica si un carácter pertenece a un identificador según el caso (a).
        """
        return identificador_mapper(ch) != -1

    def is_numero(ch: str) -> bool:
        """
        Verifica si un carácter pertenece a un número según el caso (c).
        """
        return numero_mapper(ch) != -1

    rules = [
        (is_char("b"), "b"),   # blanco
        (is_char("i"), "i"),   # identificador
        (is_char("m"), "m"),   # menos
        (is_char("n"), "n"),   # número
        (is_char("s"), "s")    # suma
    ]

    return build_case_from_matrix(names, alph, matrix_c, "AJ", accept_names, rules)

def tokenize_for_case_d(text: str):
    """
    Convierte una cadena real en tokens {b,i,m,n,s} para el caso (d):
    - Usa el caso (a) para identificadores  -> 'i'
    - Usa el caso (c) para números          -> 'n'
    - ' ' o '\t'                            -> 'b' (colapsa varios en UN 'b')
    - '+'                                   -> 's'
    - '-'                                   -> 'm'
    Devuelve (tokens_str, None) o (None, pos_error) si hay error de tokenización.
    """
    dfa_i, map_i = build_case_a()
    dfa_n, map_n = build_case_c()

    i = 0
    out = []
    while i < len(text):
        ch = text[i]

        # Agrupa blancos consecutivos en un solo token 'b'
        if is_blank(ch):
            while i < len(text) and is_blank(text[i]):
                i += 1
            out.append('b')
            continue

        if ch == '+': out.append('s'); i += 1; continue
        if ch == '-': out.append('m'); i += 1; continue

        # Busca el máximo avance para identificador y número
        li = longest_match(dfa_i, map_i, text, i)
        ln = longest_match(dfa_n, map_n, text, i)

        if li == 0 and ln == 0:
            return None, i  # símbolo ilegítimo

        if li >= ln:          # en caso de empate, prioriza identificador
            out.append('i')
            i += li
        else:
            out.append('n')
            i += ln

    return "".join(out), None

# -------------- Diccionario de casos disponibles --------------
CASES = {
    "a": build_case_a,
    "b": build_case_b,
    "c": build_case_c,
    "d": build_case_d,
}

def run_cli() -> None:
    """
    Interfaz de línea de comandos para probar los distintos casos de DFA.
    Permite al usuario elegir un caso y probar cadenas de entrada.
    """
    print("PL1 – Máquina de estados genérica (DFA)")
    print("Casos disponibles:", ", ".join(CASES.keys()))
    choice = input("Elige caso (demo/a/b/c/d): ").strip().lower()
    if choice not in CASES:
        print("Caso no reconocido."); return
    try:
        dfa, mapper = CASES[choice]()
    except NotImplementedError as e:
        print(e); return

    print(f"Estados: {dfa.state_names} | Inicio: {dfa.state_names[dfa.start]} | Aceptación: {[dfa.state_names[i] for i in dfa.accept]}")
    print("Introduce cadenas (ENTER vacío para salir):")
    while True:
        s = input("> ")
        if s == "": break

        if choice == "d":
            tokens, bad = tokenize_for_case_d(s)
            if tokens is None:
                print(f"Token no reconocido cerca de la pos {bad}: {repr(s[bad])}")
                continue
            print("Tokens:", tokens)  # útil para depurar
            ok, trace = dfa.run(mapper, tokens)
        else:
            ok, trace = dfa.run(mapper, s)

        path = " -> ".join(f"{dfa.state_names[a]} -[{sym}]-> {dfa.state_names[b] if b>=0 else 'X'}"
                        for a, sym, b in trace)
        print(path)
        print("Resultado:", "ACEPTADA ✅" if ok else "RECHAZADA ❌", "\n")

# -------------- Punto de entrada principal --------------
if __name__ == "__main__":
    run_cli()