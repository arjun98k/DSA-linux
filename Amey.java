
class  AmeyFriend {
    int  Add(int a ,int b){
        return a+b;
    }

    
    int Add(int a ,int b ,int c){
        return a*b*c;
    }
}



public class Amey {
    public static void main(String[] args) {

        AmeyFriend obj = new AmeyFriend();
        int a = obj.Add(98, 11);
        int b = obj.Add(11, 98, 55);
        System.out.println(a);
        System.out.println(b);
    }
}
