/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemArchitecture;

/**
 *
 * @author User
 */
public class Tea extends Drink{
    TeaType teaType;
    public Tea(SugarType sugar, IceType ice) {
        super(sugar, ice);
    }
     public void setTeaType(TeaType teaType) {
        this.teaType = teaType;
    }
     public TeaType getTeaType() {
        return teaType;
    }
     enum TeaType{
        LEMON,OOLONG,GINGER,HONEY
    }

}
