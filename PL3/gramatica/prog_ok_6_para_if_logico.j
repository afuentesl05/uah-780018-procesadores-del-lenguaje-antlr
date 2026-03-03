.class public Programa
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
    .limit stack 50
    .limit locals 50

    ldc 0
    istore 1
for_cond0:
    iload 1
    ldc 5
    if_icmplt rel_true2
    iconst_0
    goto rel_end3
rel_true2:
    iconst_1
rel_end3:
    ifeq for_fin1
    iload 1
    ldc 2
    if_icmplt rel_true6
    iconst_0
    goto rel_end7
rel_true6:
    iconst_1
rel_end7:
    iload 1
    ldc 3
    if_icmpgt rel_true8
    iconst_0
    goto rel_end9
rel_true8:
    iconst_1
rel_end9:
    ior
    ifeq if_next5
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "i fuera del rango [2,3]"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    goto endif4
if_next5:
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "i dentro del rango [2,3]"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
endif4:
    iload 1
    ldc 1
    iadd
    istore 1
    goto for_cond0
for_fin1:
    return
.end method
