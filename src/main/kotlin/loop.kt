fun main(args: Array<String>){
    first@ for (i in 1..4){
        second@ for (j in 1..2){
            println("i = $i, j = $j")
            if(i==2)
                break@first
        }
    }
    var num1 = 4
    outer@ while(num1 > 0){
        var num2 = 4
        inner@ while(num2 > 0) {
            if (num1 == 2)
                break@outer
            println("num1 = $num1, num2 == $num2")
            num2--
        }
        num1--
        }
    }
