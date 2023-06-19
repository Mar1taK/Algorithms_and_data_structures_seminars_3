package seminar1;

public class task1{

    // линейная сложность O(N)
    public static int Sum(int N){ // функция возвращает сумму чисел введенного числа N
        int res  = 0;
        for(int i = 0; i <= N; i++){
            res += i;
        }
        return res;
    }

    // поиск простых чисел (числа делятся только на себя и на 1)  вдиапазоне от 1 до N
    // for -  говорит о квадратиччной сложночти
    // сложность O(N2)

    public static void Simple(int N){
        for(int num = 1; num <= N; num++){
            boolean simple = true;
            for (int i = 2; i * i <= num; i++){
                if(num % i == 0){
                    simple = false;
                    break;
                }
            }
            if(simple){
                System.out.printf("%d ", num);
            }
            
        }
    }


    public static void main(String[] args){

      Simple(100);      

    }
}