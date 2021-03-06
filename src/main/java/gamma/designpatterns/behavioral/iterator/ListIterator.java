/*
 * @(#)ListIterator.java   2011-11-01
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



/*
* ListIterator.java
*
* Created on 4 novembre 2006, 10.30
*
* To change this template, choose Tools | Template Manager
* and open the template in the editor.
 */
package gamma.designpatterns.behavioral.iterator;

/**
 *
 * @author gperon
 *
 * @param <Item>
 */
public class ListIterator<Item> implements Iterator {
    private List<Item> list;
    private int current;

    /**
     * Creates a new instance of ListIterator
     *
     * @param l
     */
    public ListIterator(List l) {
        list = l;
        current = 0;
    }

    /**
     * Method description
     *
     */
    public void first() {
        current = 0;
    }

    /**
     * Method description
     *
     */
    public void next() {
        current++;
    }

    /**
     * Method description
     *
     *
     * @return
     */
    public boolean isDone() {
        return current >= list.count();
    }

    /**
     * Method description
     *
     *
     * @return
     */
    public Item currentItem() {
        return list.get(current);
    }
}
