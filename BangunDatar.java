/**
 *
 * @author OPRATOR KOMPUTER 2
 */
public class BangunDatar {
    
    int p,l,s;
    //KonstruktorBS
    BangunDatar(int s){
        this.s = s;
    }
    //KonstruktorP
    BangunDatar(int p, int l){
        this.p = p;
        this.l = l;
    }
    //setter
    void setPL(int p, int l){
        this.p = p;
        this.l = l;
    }

    void setS(int s){
        this.s = s;
    }
    //getter
    int getP(){
        return p;
    }
    int getL(){
        return l;
    }
    int getS(){
        return s;
    }
         
}
