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
public interface InterfaceCharacterProcessing {
    void reset();
    void process(char c, int ofs);
    void flush();
    void close();
}
