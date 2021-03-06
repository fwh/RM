/* This file was generated by SableCC (http://www.sablecc.org/). */

package rm.node;

import rm.analysis.*;

@SuppressWarnings("nls")
public final class AEqualRelop extends PRelop
{
    private TEqualsym _equalsym_;

    public AEqualRelop()
    {
        // Constructor
    }

    public AEqualRelop(
        @SuppressWarnings("hiding") TEqualsym _equalsym_)
    {
        // Constructor
        setEqualsym(_equalsym_);

    }

    @Override
    public Object clone()
    {
        return new AEqualRelop(
            cloneNode(this._equalsym_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEqualRelop(this);
    }

    public TEqualsym getEqualsym()
    {
        return this._equalsym_;
    }

    public void setEqualsym(TEqualsym node)
    {
        if(this._equalsym_ != null)
        {
            this._equalsym_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._equalsym_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._equalsym_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._equalsym_ == child)
        {
            this._equalsym_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._equalsym_ == oldChild)
        {
            setEqualsym((TEqualsym) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
