/* This file was generated by SableCC (http://www.sablecc.org/). */

package rm.node;

import rm.analysis.*;

@SuppressWarnings("nls")
public final class ADef extends PDef
{
    private TLetsym _letsym_;
    private TIdent _ident_;
    private PParlst _parlst_;
    private TAssignsym _assignsym_;
    private PExpr _expr_;
    private TSemicolonsym _semicolonsym_;

    public ADef()
    {
        // Constructor
    }

    public ADef(
        @SuppressWarnings("hiding") TLetsym _letsym_,
        @SuppressWarnings("hiding") TIdent _ident_,
        @SuppressWarnings("hiding") PParlst _parlst_,
        @SuppressWarnings("hiding") TAssignsym _assignsym_,
        @SuppressWarnings("hiding") PExpr _expr_,
        @SuppressWarnings("hiding") TSemicolonsym _semicolonsym_)
    {
        // Constructor
        setLetsym(_letsym_);

        setIdent(_ident_);

        setParlst(_parlst_);

        setAssignsym(_assignsym_);

        setExpr(_expr_);

        setSemicolonsym(_semicolonsym_);

    }

    @Override
    public Object clone()
    {
        return new ADef(
            cloneNode(this._letsym_),
            cloneNode(this._ident_),
            cloneNode(this._parlst_),
            cloneNode(this._assignsym_),
            cloneNode(this._expr_),
            cloneNode(this._semicolonsym_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADef(this);
    }

    public TLetsym getLetsym()
    {
        return this._letsym_;
    }

    public void setLetsym(TLetsym node)
    {
        if(this._letsym_ != null)
        {
            this._letsym_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._letsym_ = node;
    }

    public TIdent getIdent()
    {
        return this._ident_;
    }

    public void setIdent(TIdent node)
    {
        if(this._ident_ != null)
        {
            this._ident_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._ident_ = node;
    }

    public PParlst getParlst()
    {
        return this._parlst_;
    }

    public void setParlst(PParlst node)
    {
        if(this._parlst_ != null)
        {
            this._parlst_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parlst_ = node;
    }

    public TAssignsym getAssignsym()
    {
        return this._assignsym_;
    }

    public void setAssignsym(TAssignsym node)
    {
        if(this._assignsym_ != null)
        {
            this._assignsym_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._assignsym_ = node;
    }

    public PExpr getExpr()
    {
        return this._expr_;
    }

    public void setExpr(PExpr node)
    {
        if(this._expr_ != null)
        {
            this._expr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expr_ = node;
    }

    public TSemicolonsym getSemicolonsym()
    {
        return this._semicolonsym_;
    }

    public void setSemicolonsym(TSemicolonsym node)
    {
        if(this._semicolonsym_ != null)
        {
            this._semicolonsym_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semicolonsym_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._letsym_)
            + toString(this._ident_)
            + toString(this._parlst_)
            + toString(this._assignsym_)
            + toString(this._expr_)
            + toString(this._semicolonsym_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._letsym_ == child)
        {
            this._letsym_ = null;
            return;
        }

        if(this._ident_ == child)
        {
            this._ident_ = null;
            return;
        }

        if(this._parlst_ == child)
        {
            this._parlst_ = null;
            return;
        }

        if(this._assignsym_ == child)
        {
            this._assignsym_ = null;
            return;
        }

        if(this._expr_ == child)
        {
            this._expr_ = null;
            return;
        }

        if(this._semicolonsym_ == child)
        {
            this._semicolonsym_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._letsym_ == oldChild)
        {
            setLetsym((TLetsym) newChild);
            return;
        }

        if(this._ident_ == oldChild)
        {
            setIdent((TIdent) newChild);
            return;
        }

        if(this._parlst_ == oldChild)
        {
            setParlst((PParlst) newChild);
            return;
        }

        if(this._assignsym_ == oldChild)
        {
            setAssignsym((TAssignsym) newChild);
            return;
        }

        if(this._expr_ == oldChild)
        {
            setExpr((PExpr) newChild);
            return;
        }

        if(this._semicolonsym_ == oldChild)
        {
            setSemicolonsym((TSemicolonsym) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
