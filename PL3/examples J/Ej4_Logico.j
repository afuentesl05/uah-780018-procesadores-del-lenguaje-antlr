.source Main.java
.class public Ej4_Logico
.super java/lang/Object

.method public <init>()V
  .limit stack 1
  .limit locals 1
  aload_0
  invokenonvirtual java/lang/Object/<init>()V
  return
.end method

.method public static main([Ljava/lang/String;)V
  .limit stack  32
  .limit locals 32

  ; 3 < 5  -> true
  iconst_3
  iconst_5
  if_icmpge L_FALSE1
  iconst_1
  goto L_ENDCMP1
L_FALSE1:
  iconst_0
L_ENDCMP1:
  istore_0      ; tmp1

  ; 10 > 2 -> true
  bipush 10
  iconst_2
  if_icmple L_FALSE2
  iconst_1
  goto L_ENDCMP2
L_FALSE2:
  iconst_0
L_ENDCMP2:
  istore_1      ; tmp2

  ; tmp1 && tmp2
  iload_0
  iload_1
  iand
  istore_2      ; b

  ; System.out.println(b);
  getstatic java/lang/System/out Ljava/io/PrintStream;
  iload_2
  invokevirtual java/io/PrintStream/println(Z)V

  return
.end method
