.data

.text

f:
# prologue
subu $sp, $sp, 4
sw $ra 0($sp)
subu $sp, $sp, 4
sw $fp 0($sp)
move $fp, $sp
subu $sp, $sp, 4
sw $t0, 0($sp)
subu $sp, $sp, 4
sw $t1, 0($sp)
subu $sp, $sp, 4
sw $t2, 0($sp)
subu $sp, $sp, 4
sw $t3, 0($sp)
subu $sp, $sp, 4
sw $t4, 0($sp)
subu $sp, $sp, 4
sw $t5, 0($sp)
subu $sp, $sp, 4
sw $t6, 0($sp)
subu $sp, $sp, 4
sw $t7, 0($sp)
subu $sp, $sp, 4
sw $t8, 0($sp)
subu $sp, $sp, 4
sw $t9, 0($sp)
subu $sp, $sp, 16

lw $t0, 8($fp)
lw $t1, 12($fp)
add $t2, $t0, $t1
sw $t2, -44($fp)
lw $t3, -44($fp)
move $v0, $t3
j f_epilogue

f_epilogue:
move $sp, $fp
lw $t0, -4($sp)
lw $t1, -8($sp)
lw $t2, -12($sp)
lw $t3, -16($sp)
lw $t4, -20($sp)
lw $t5, -24($sp)
lw $t6, -28($sp)
lw $t7, -32($sp)
lw $t8, -36($sp)
lw $t9, -40($sp)
lw $fp, 0($sp)
lw $ra, 4($sp)
addu $sp, $sp, 8
jr $ra

user_main:
# prologue
subu $sp, $sp, 4
sw $ra 0($sp)
subu $sp, $sp, 4
sw $fp 0($sp)
move $fp, $sp
subu $sp, $sp, 4
sw $t0, 0($sp)
subu $sp, $sp, 4
sw $t1, 0($sp)
subu $sp, $sp, 4
sw $t2, 0($sp)
subu $sp, $sp, 4
sw $t3, 0($sp)
subu $sp, $sp, 4
sw $t4, 0($sp)
subu $sp, $sp, 4
sw $t5, 0($sp)
subu $sp, $sp, 4
sw $t6, 0($sp)
subu $sp, $sp, 4
sw $t7, 0($sp)
subu $sp, $sp, 4
sw $t8, 0($sp)
subu $sp, $sp, 4
sw $t9, 0($sp)
subu $sp, $sp, 16

li $t0, 2
subu $sp, $sp, 4
sw $t0 0($sp)
li $t1, 1
subu $sp, $sp, 4
sw $t1 0($sp)
jal f
addu $sp, $sp, 8
move $t2, $v0
sw $t2, -44($fp)
# inline implementation of PrintInt
lw $t3, -44($fp)
li $v0, 1
move $a0, $t3
syscall
j user_main_epilogue

user_main_epilogue:
move $sp, $fp
lw $t0, -4($sp)
lw $t1, -8($sp)
lw $t2, -12($sp)
lw $t3, -16($sp)
lw $t4, -20($sp)
lw $t5, -24($sp)
lw $t6, -28($sp)
lw $t7, -32($sp)
lw $t8, -36($sp)
lw $t9, -40($sp)
lw $fp, 0($sp)
lw $ra, 4($sp)
addu $sp, $sp, 8
jr $ra

main:
jal user_main
li $v0, 10
syscall
