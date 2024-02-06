void main(){
    int x=0;

//    while(x++<21){
//
//        System.out.print(  x==6  ? "\n" :x==11 ? "\n": x==15 ? "\n" :x==18 ? "\n": x==20? "\b": "*");
//
//    }

    while(x++<25){
        System.out.print(x%6==0 && x<7 ? "\n" :x%6==0 && x<13 ? "\b\n" :x%6==0 && x<19 ? "\b\b\n" :x%6==0 && x<25 ? "\b\b\b\n" :"*" );
    }

}