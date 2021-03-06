/* This file was generated by SableCC (http://www.sablecc.org/). */

package rm.node;

import rm.analysis.*;

@SuppressWarnings("nls")
public final class ANumSimplefactor extends PSimplefactor
{
    private PNumfac _numfac_;

    public ANumSimplefactor()
    {
        // Constructor
    }

    public ANumSimplefactor(
        @SuppressWarnings("hiding") PNumfac _numfac_)
    {
        // Constructor
        setNumfac(_numfac_);

    }

    @Override
    public Object clone()
    {
        return new ANumSimplefactor(
            cloneNode(this._numfac_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANumSimplefactor(this);
    }

    public PNumfac getNumfac()
    {
        return this._numfac_;
    }

    public void setNumfac(PNumfac node)
    {
        if(this._numfac_ != null)
        {
            this._numfac_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._numfac_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._numfac_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._numfac_ == child)
        {
            this._numfac_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._numfac_ == oldChild)
        {
            setNumfac((PNumfac) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
