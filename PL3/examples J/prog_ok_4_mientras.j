.class public Programa_4
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
    .limit stack 50
    .limit locals 50

    ldc 0
    istore 1
while_ini0:
    iload 1
    ldc 3
    if_icmplt rel_true2
    iconst_0
    goto rel_end3
rel_true2:
    iconst_1
rel_end3:
    ifeq while_fin1
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 1
    invokevirtual java/io/PrintStream/println(I)V
    iload 1
    ldc 1
    iadd
    istore 1
    goto while_ini0
while_fin1:
    return
.end method
