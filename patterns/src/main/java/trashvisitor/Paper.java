// patterns/trashvisitor/Paper.java
// (c)2017 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
// Paper for the visitor pattern
package trashvisitor;

import trash.*;

public class Paper extends trash.Paper
        implements Visitable {
    public Paper(double wt) {
        super(wt);
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
