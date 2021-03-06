/*
 * @(#)ColorImage.java   2011-11-01
 *
 * Copyright (c) 2011 Giorgio Peron giorgio.peron@gmail.com
 * All Rights Reserved.
 *
 * Redistribution and use of this script, with or without modification, is
 * permitted provided that the following conditions are met:
 *
 * 1. Redistributions of this script must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ''AS IS'' AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO
 * EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR
 * OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */



package cooper.designpatterns.behavioral.chainofresponsibility;

import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;

/**
 * Class description
 *
 *
 * @version        0.1.1, 2011-11-01
 * @author         <a href="mailto:giorgio.peron@gmail.com">Giorgio Peron</a>
 */
public class ColorImage extends JPanel implements Chain {
    private Chain nextChain;

    /**
     * Constructs ...
     *
     */
    public ColorImage() {
        super();
        setBorder(new LineBorder(Color.black));
    }

    /**
     * Method description
     *
     *
     * @param c
     */
    public void addChain(Chain c) {
        nextChain = c;
    }

    /**
     * Method description
     *
     *
     * @param mesg
     */
    public void sendToChain(String mesg) {
        Color c = getColor(mesg);
        if (c != null) {
            setBackground(c);
            repaint();
        } else {
            if (nextChain != null) {
                nextChain.sendToChain(mesg);
            }
        }
    }

    private Color getColor(String mesg) {
        String lmesg = mesg.toLowerCase();
        Color c = null;
        if (lmesg.equals("red")) {
            c = Color.red;
        }
        if (lmesg.equals("blue")) {
            c = Color.blue;
        }
        if (lmesg.equals("green")) {
            c = Color.green;
        }

        return c;
    }

    /**
     * Method description
     *
     *
     * @return
     */
    public Chain getChain() {
        return nextChain;
    }
}
