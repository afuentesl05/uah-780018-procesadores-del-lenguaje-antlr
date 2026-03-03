.class public Programa_3
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
    .limit stack 50
    .limit locals 50

    ldc 7
    istore 1
    ldc 10
    istore 2
    iload 1
    iload 2
    if_icmplt rel_true2
    iconst_0
    goto rel_end3
rel_true2:
    iconst_1
rel_end3:
    ifeq if_next1
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "x es menor que y"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    goto endif0
if_next1:
    iload 1
    iload 2
    if_icmpeq eq_true5
    iconst_0
    goto eq_end6
eq_true5:
    iconst_1
eq_end6:
    ifeq if_next4
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "x es igual que y"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    goto endif0
if_next4:
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "x es mayor que y"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
endif0:
    return
.end method
