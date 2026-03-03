.class public Programa_5
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
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 1
    invokevirtual java/io/PrintStream/println(I)V
    iload 1
    ldc 1
    iadd
    istore 1
    goto for_cond0
for_fin1:
    return
.end method
