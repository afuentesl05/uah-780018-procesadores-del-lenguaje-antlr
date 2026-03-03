.class public Programa_1
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
    .limit stack 50
    .limit locals 50

    ldc 5
    istore 1
    ldc 3
    istore 2
    iload 1
    iload 2
    iadd
    istore 1
    iload 1
    ldc 1
    isub
    istore 1
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 1
    invokevirtual java/io/PrintStream/println(I)V
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 2
    invokevirtual java/io/PrintStream/println(I)V
    return
.end method
