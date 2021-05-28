public class KelasB extends KelasA implements InterfaceA{
    private String atributB;

    public String getAtributB() {
        return atributB;
    }

    public void setAtributB(String atributB) {
        this.atributB = atributB;
    }

    public static void main(String[] args){
        KelasB kelasB = new KelasB();
        kelasB.setAtributA("KelasA atribut A");
        System.out.println(kelasB.getAtributA());
        kelasB.methodA();
        kelasB.methodB();
    }

    @Override
    public void methodA() {
        System.out.println("interface method A");
    }

    @Override
    public void methodB() {
        System.out.println("interface method B");
    }
}
