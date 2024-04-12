interface custom
{
    int amt=5;  // public + static + final
    void purchase();    // public + abstract
}
class Raj implements custom
{
    @Override
    public void purchase() {
        System.out.println("Raj needs "+amt+"kg rice");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        custom c=new Raj();
        c.purchase();
        System.out.println(custom.amt);  // Proving why variables are static "Direct calling from class/interface"
    }
}
