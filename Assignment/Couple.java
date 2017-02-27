/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pplassign1;

/**
 *
 * @author sahil
 */
public class Couple {
    String id;
    Boy boy;
    Girl girl;
    public Couple(Boy boy,Girl girl)
    {
        this.boy = boy;
        this.girl = girl;
        this.id = this.boy.name+"++"+this.girl.name;
    }
}
