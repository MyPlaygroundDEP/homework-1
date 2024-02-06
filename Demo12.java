void main() {
    int x = 0;
    while (x++ < 54) {
        System.out.print(x%6==0 && x<7 ? "\n" :x%6==0 && x<13 ? "\b\n" :x%6==0 && x<19 ? "\b\b\n" :x%6==0 && x<25 ? "\b\b\b\n":
                x%6==0 && x<31 ? "\b\b\b\b\n" :x%6==0 && x<37 ? "\b\b\b\n" :x%6==0 && x<43 ? "\b\b\n" :x%6==0 && x<49 ? "\b\n"    :"*" );

    }
}