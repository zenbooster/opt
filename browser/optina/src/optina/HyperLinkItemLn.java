/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package optina;

/**
 *
 * @author Goncharov.Ilia
 */
public class HyperLinkItemLn extends HyperLinkItem {
    private int ln;
    
    public HyperLinkItemLn(HyperLinkItem other, int ln)
    {
        super(other);
        this.ln = ln;
        getMngr().register(this);
    }
    
    public int getLineNumber()
    {return ln;}
}
