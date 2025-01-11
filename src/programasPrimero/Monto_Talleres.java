package programasPrimero;
import javax.swing.JOptionPane;

public class Monto_Talleres {
    public void mostrar() {
        float basket , voli ,artes ,fut ,taek ,aje ,mus ,atle;
        short mBask=9000 , mVoli=15000, mFut=15000, mAje=25000 , mMus=12000 , mAtl=13000;
        int montoT=189000, mTaek=50000, mArt=50000;
        basket = (mBask/(montoT/100));
        voli = (mVoli/(montoT/100));
        artes= (mArt/(montoT/100));
        fut =(mFut/(montoT/100));
        taek=(mTaek/(montoT/100));
        aje=(mAje/(montoT/100));
        mus=(mMus/(montoT/100));
        atle=(mAtl/(montoT/100));
        String resultado=
        "Taller basketball: $"+mBask+", porcentaje: "+basket+"%\n"+
        "Taller voliball: $"+mVoli+", porcentaje: "+voli+"%\n"+
        "Taller artes: $"+mArt+", porcentaje: "+artes+"%\n"+
        "Taller taekwondo: $"+mTaek+", porcentaje: "+taek+"%\n"+
        "Taller ajedrez: $"+mAje+", porcentaje: "+aje+"%\n"+
        "Taller musica: $"+mMus+", porcentaje: "+mus+"%\n"+
        "Taller atletismo: $"+mAtl+", porcentaje: "+atle+"%";
        JOptionPane.showMessageDialog(null,resultado);
        
        
        
        
    }
}

