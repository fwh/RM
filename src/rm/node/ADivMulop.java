/* This file was generated by SableCC (http://www.sablecc.org/). */

package rm.node;

import rm.analysis.*;

@SuppressWarnings("nls")
public final class ADivMulop extends PMulop
{
    private TDivsym _divsym_;

    public ADivMulop()
    {
        // Constructor
    }

    public ADivMulop(
        @SuppressWarnings("hiding") TDivsym _divsym_)
    {
        // Constructor
        setDivsym(_divsym_);

    }

    @Override
    public Object clone()
    {
        return new ADivMulop(
            cloneNode(this._divsym_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADivMulop(this);
    }

    public TDivsym getDivsym()
    {
        return this._divsym_;
    }

    public void setDivsym(TDivsym node)
    {
        if(this._divsym_ != null)
        {
            this._divsym_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._divsym_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._divsym_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._divsym_ == child)
        {
            this._divsym_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._divsym_ == oldChild)
        {
            setDivsym((TDivsym) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
