void main(){
    int y=0;
    while(y++<9){
        int x=0;
        while(x++ <(y<6 ? (6-y) : (y-4) )){
            System.out.print("*");
        }
        System.out.println();
    }
}