/* This file was generated by SableCC (http://www.sablecc.org/). */

package rm.node;

import rm.analysis.*;

@SuppressWarnings("nls")
public final class AScnumRealnum extends PRealnum
{
    private TRealdenotation _base_;
    private TEsym _esym_;
    private PNumfac _exp_;

    public AScnumRealnum()
    {
        // Constructor
    }

    public AScnumRealnum(
        @SuppressWarnings("hiding") TRealdenotation _base_,
        @SuppressWarnings("hiding") TEsym _esym_,
        @SuppressWarnings("hiding") PNumfac _exp_)
    {
        // Constructor
        setBase(_base_);

        setEsym(_esym_);

        setExp(_exp_);

    }

    @Override
    public Object clone()
    {
        return new AScnumRealnum(
            cloneNode(this._base_),
            cloneNode(this._esym_),
            cloneNode(this._exp_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAScnumRealnum(this);
    }

    public TRealdenotation getBase()
    {
        return this._base_;
    }

    public void setBase(TRealdenotation node)
    {
        if(this._base_ != null)
        {
            this._base_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._base_ = node;
    }

    public TEsym getEsym()
    {
        return this._esym_;
    }

    public void setEsym(TEsym node)
    {
        if(this._esym_ != null)
        {
            this._esym_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._esym_ = node;
    }

    public PNumfac getExp()
    {
        return this._exp_;
    }

    public void setExp(PNumfac node)
    {
        if(this._exp_ != null)
        {
            this._exp_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._exp_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._base_)
            + toString(this._esym_)
            + toString(this._exp_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._base_ == child)
        {
            this._base_ = null;
            return;
        }

        if(this._esym_ == child)
        {
            this._esym_ = null;
            return;
        }

        if(this._exp_ == child)
        {
            this._exp_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._base_ == oldChild)
        {
            setBase((TRealdenotation) newChild);
            return;
        }

        if(this._esym_ == oldChild)
        {
            setEsym((TEsym) newChild);
            return;
        }

        if(this._exp_ == oldChild)
        {
            setExp((PNumfac) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
