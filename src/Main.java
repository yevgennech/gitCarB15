public class Main {
    public static void main(String[] args) {

        BasicStructure audi=new BasicStructure();
        audi.color="black";
        audi.model="A3";
        audi.power="5000cc";

        Engine x=new Engine();
        x.cylinders="4";
        x.size="1500";
        x.weight="12345";


        color col= new color();
        col.colorLights="True";
        col.colorTyre="false";
        col.colorWindows="True";

        lights neon=new lights();
        neon.color="red";
        neon.size="big";
        

    }
}