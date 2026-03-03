.class public Programa
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
    .limit stack 50
    .limit locals 50

    ldc 5
    istore 1
    ldc 2.5
    fstore 2
    iload 1
    i2f
    fload 2
    fadd
    fstore 3
    iload 1
    ldc 2
    imul
    istore 4
    getstatic java/lang/System/out Ljava/io/PrintStream;
    fload 3
    invokevirtual java/io/PrintStream/println(F)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 4
    invokevirtual java/io/PrintStream/println(I)V
    return
.end method
