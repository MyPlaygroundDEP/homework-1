void main(){
    int x=0;
//    while(x++<22){
//        System.out.print(x==2 ? "\n": x==5 ?  "\n" :  x==9 ?  "\n" :  x==14 ?  "\n" :  x==18 ?  "\n" : x==21 ?  "\n" :"*");
//
//    }

    while(x++<37){
        System.out.print(x%6==0 && x<7 ? "\b\b\b\b\n" :x%6==0 && x<13 ? "\b\b\b\n" :x%6==0 && x<19 ? "\b\b\n" :x%6==0 && x<25 ? "\b\n" :x%6==0 && x<31 ? "\b\b\n" :x%6==0 && x<37 ? "\b\b\b\n" :"*" );
    }

}