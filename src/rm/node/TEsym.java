/* This file was generated by SableCC (http://www.sablecc.org/). */

package rm.node;

import rm.analysis.*;

@SuppressWarnings("nls")
public final class TEsym extends Token
{
    public TEsym()
    {
        super.setText("E");
    }

    public TEsym(int line, int pos)
    {
        super.setText("E");
        setLine(line);
        setPos(pos);
    }

    @Override
    public Object clone()
    {
      return new TEsym(getLine(), getPos());
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseTEsym(this);
    }

    @Override
    public void setText(@SuppressWarnings("unused") String text)
    {
        throw new RuntimeException("Cannot change TEsym text.");
    }
}
