; ModuleID = 'mymodule'
declare i32 @printf(i8*, ...)
@print.str = constant [4 x i8] c"%d\0A\00"

define i32 @main() {
%t0 = add i32 0, 10
%x = %t0

%t1 = add i32 0, 20
%y = %t1

%t2 = icmp slt i32 %x, %y
br i1 %t2, label %then_0, label %end_1
then_0:
%t3 = add i32 0, %x
call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @print.str, i32 0, i32 0), i32 %t3)

br label %end_1
end_1:

ret i32 0
}