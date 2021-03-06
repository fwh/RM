/* This file was generated by SableCC (http://www.sablecc.org/). */

package rm.analysis;

import java.util.*;
import rm.node.*;

public class DepthFirstAdapter extends AnalysisAdapter
{
    public void inStart(Start node)
    {
        defaultIn(node);
    }

    public void outStart(Start node)
    {
        defaultOut(node);
    }

    public void defaultIn(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    public void defaultOut(@SuppressWarnings("unused") Node node)
    {
        // Do nothing
    }

    @Override
    public void caseStart(Start node)
    {
        inStart(node);
        node.getPProgram().apply(this);
        node.getEOF().apply(this);
        outStart(node);
    }

    public void inADefProgram(ADefProgram node)
    {
        defaultIn(node);
    }

    public void outADefProgram(ADefProgram node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADefProgram(ADefProgram node)
    {
        inADefProgram(node);
        if(node.getDef() != null)
        {
            node.getDef().apply(this);
        }
        if(node.getProgram() != null)
        {
            node.getProgram().apply(this);
        }
        outADefProgram(node);
    }

    public void inACompProgram(ACompProgram node)
    {
        defaultIn(node);
    }

    public void outACompProgram(ACompProgram node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACompProgram(ACompProgram node)
    {
        inACompProgram(node);
        if(node.getComp() != null)
        {
            node.getComp().apply(this);
        }
        if(node.getProgram() != null)
        {
            node.getProgram().apply(this);
        }
        outACompProgram(node);
    }

    public void inAEndProgram(AEndProgram node)
    {
        defaultIn(node);
    }

    public void outAEndProgram(AEndProgram node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEndProgram(AEndProgram node)
    {
        inAEndProgram(node);
        if(node.getEndsym() != null)
        {
            node.getEndsym().apply(this);
        }
        outAEndProgram(node);
    }

    public void inADef(ADef node)
    {
        defaultIn(node);
    }

    public void outADef(ADef node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADef(ADef node)
    {
        inADef(node);
        if(node.getLetsym() != null)
        {
            node.getLetsym().apply(this);
        }
        if(node.getIdent() != null)
        {
            node.getIdent().apply(this);
        }
        if(node.getParlst() != null)
        {
            node.getParlst().apply(this);
        }
        if(node.getAssignsym() != null)
        {
            node.getAssignsym().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getSemicolonsym() != null)
        {
            node.getSemicolonsym().apply(this);
        }
        outADef(node);
    }

    public void inAComp(AComp node)
    {
        defaultIn(node);
    }

    public void outAComp(AComp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComp(AComp node)
    {
        inAComp(node);
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getQuestionsym() != null)
        {
            node.getQuestionsym().apply(this);
        }
        outAComp(node);
    }

    public void inAParlstParlst(AParlstParlst node)
    {
        defaultIn(node);
    }

    public void outAParlstParlst(AParlstParlst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParlstParlst(AParlstParlst node)
    {
        inAParlstParlst(node);
        if(node.getLparsym() != null)
        {
            node.getLparsym().apply(this);
        }
        if(node.getPars() != null)
        {
            node.getPars().apply(this);
        }
        if(node.getRparsym() != null)
        {
            node.getRparsym().apply(this);
        }
        outAParlstParlst(node);
    }

    public void inAEmptyParlst(AEmptyParlst node)
    {
        defaultIn(node);
    }

    public void outAEmptyParlst(AEmptyParlst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEmptyParlst(AEmptyParlst node)
    {
        inAEmptyParlst(node);
        if(node.getEmpty() != null)
        {
            node.getEmpty().apply(this);
        }
        outAEmptyParlst(node);
    }

    public void inAIdentPars(AIdentPars node)
    {
        defaultIn(node);
    }

    public void outAIdentPars(AIdentPars node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdentPars(AIdentPars node)
    {
        inAIdentPars(node);
        if(node.getIdent() != null)
        {
            node.getIdent().apply(this);
        }
        outAIdentPars(node);
    }

    public void inACommaPars(ACommaPars node)
    {
        defaultIn(node);
    }

    public void outACommaPars(ACommaPars node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACommaPars(ACommaPars node)
    {
        inACommaPars(node);
        if(node.getPars() != null)
        {
            node.getPars().apply(this);
        }
        if(node.getCommasym() != null)
        {
            node.getCommasym().apply(this);
        }
        if(node.getIdent() != null)
        {
            node.getIdent().apply(this);
        }
        outACommaPars(node);
    }

    public void inAComplexExpr(AComplexExpr node)
    {
        defaultIn(node);
    }

    public void outAComplexExpr(AComplexExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAComplexExpr(AComplexExpr node)
    {
        inAComplexExpr(node);
        if(node.getIfsym() != null)
        {
            node.getIfsym().apply(this);
        }
        if(node.getRelcomp() != null)
        {
            node.getRelcomp().apply(this);
        }
        if(node.getThensym() != null)
        {
            node.getThensym().apply(this);
        }
        if(node.getTrueclause() != null)
        {
            node.getTrueclause().apply(this);
        }
        if(node.getElsesym() != null)
        {
            node.getElsesym().apply(this);
        }
        if(node.getFalseclause() != null)
        {
            node.getFalseclause().apply(this);
        }
        outAComplexExpr(node);
    }

    public void inASimpleExpr(ASimpleExpr node)
    {
        defaultIn(node);
    }

    public void outASimpleExpr(ASimpleExpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimpleExpr(ASimpleExpr node)
    {
        inASimpleExpr(node);
        if(node.getSimpleexpr() != null)
        {
            node.getSimpleexpr().apply(this);
        }
        outASimpleExpr(node);
    }

    public void inACompcondRelcomp(ACompcondRelcomp node)
    {
        defaultIn(node);
    }

    public void outACompcondRelcomp(ACompcondRelcomp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACompcondRelcomp(ACompcondRelcomp node)
    {
        inACompcondRelcomp(node);
        if(node.getP1() != null)
        {
            node.getP1().apply(this);
        }
        if(node.getCondop() != null)
        {
            node.getCondop().apply(this);
        }
        if(node.getP2() != null)
        {
            node.getP2().apply(this);
        }
        outACompcondRelcomp(node);
    }

    public void inACondRelcomp(ACondRelcomp node)
    {
        defaultIn(node);
    }

    public void outACondRelcomp(ACondRelcomp node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACondRelcomp(ACondRelcomp node)
    {
        inACondRelcomp(node);
        if(node.getRelexpr() != null)
        {
            node.getRelexpr().apply(this);
        }
        outACondRelcomp(node);
    }

    public void inARelexpr(ARelexpr node)
    {
        defaultIn(node);
    }

    public void outARelexpr(ARelexpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARelexpr(ARelexpr node)
    {
        inARelexpr(node);
        if(node.getLeft() != null)
        {
            node.getLeft().apply(this);
        }
        if(node.getRelop() != null)
        {
            node.getRelop().apply(this);
        }
        if(node.getRight() != null)
        {
            node.getRight().apply(this);
        }
        outARelexpr(node);
    }

    public void inATermSimpleexpr(ATermSimpleexpr node)
    {
        defaultIn(node);
    }

    public void outATermSimpleexpr(ATermSimpleexpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseATermSimpleexpr(ATermSimpleexpr node)
    {
        inATermSimpleexpr(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        outATermSimpleexpr(node);
    }

    public void inAAddSimpleexpr(AAddSimpleexpr node)
    {
        defaultIn(node);
    }

    public void outAAddSimpleexpr(AAddSimpleexpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAAddSimpleexpr(AAddSimpleexpr node)
    {
        inAAddSimpleexpr(node);
        if(node.getSimpleexpr() != null)
        {
            node.getSimpleexpr().apply(this);
        }
        if(node.getAddop() != null)
        {
            node.getAddop().apply(this);
        }
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        outAAddSimpleexpr(node);
    }

    public void inAFactorTerm(AFactorTerm node)
    {
        defaultIn(node);
    }

    public void outAFactorTerm(AFactorTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAFactorTerm(AFactorTerm node)
    {
        inAFactorTerm(node);
        if(node.getFactorexpr() != null)
        {
            node.getFactorexpr().apply(this);
        }
        outAFactorTerm(node);
    }

    public void inAMultTerm(AMultTerm node)
    {
        defaultIn(node);
    }

    public void outAMultTerm(AMultTerm node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultTerm(AMultTerm node)
    {
        inAMultTerm(node);
        if(node.getTerm() != null)
        {
            node.getTerm().apply(this);
        }
        if(node.getMulop() != null)
        {
            node.getMulop().apply(this);
        }
        if(node.getFactorexpr() != null)
        {
            node.getFactorexpr().apply(this);
        }
        outAMultTerm(node);
    }

    public void inAParFactorexpr(AParFactorexpr node)
    {
        defaultIn(node);
    }

    public void outAParFactorexpr(AParFactorexpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAParFactorexpr(AParFactorexpr node)
    {
        inAParFactorexpr(node);
        if(node.getLparsym() != null)
        {
            node.getLparsym().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        if(node.getRparsym() != null)
        {
            node.getRparsym().apply(this);
        }
        outAParFactorexpr(node);
    }

    public void inASimplefacFactorexpr(ASimplefacFactorexpr node)
    {
        defaultIn(node);
    }

    public void outASimplefacFactorexpr(ASimplefacFactorexpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASimplefacFactorexpr(ASimplefacFactorexpr node)
    {
        inASimplefacFactorexpr(node);
        if(node.getSimplefactor() != null)
        {
            node.getSimplefactor().apply(this);
        }
        outASimplefacFactorexpr(node);
    }

    public void inANumSimplefactor(ANumSimplefactor node)
    {
        defaultIn(node);
    }

    public void outANumSimplefactor(ANumSimplefactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANumSimplefactor(ANumSimplefactor node)
    {
        inANumSimplefactor(node);
        if(node.getNumfac() != null)
        {
            node.getNumfac().apply(this);
        }
        outANumSimplefactor(node);
    }

    public void inACharSimplefactor(ACharSimplefactor node)
    {
        defaultIn(node);
    }

    public void outACharSimplefactor(ACharSimplefactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseACharSimplefactor(ACharSimplefactor node)
    {
        inACharSimplefactor(node);
        if(node.getCharsym() != null)
        {
            node.getCharsym().apply(this);
        }
        outACharSimplefactor(node);
    }

    public void inAStringSimplefactor(AStringSimplefactor node)
    {
        defaultIn(node);
    }

    public void outAStringSimplefactor(AStringSimplefactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAStringSimplefactor(AStringSimplefactor node)
    {
        inAStringSimplefactor(node);
        if(node.getStringsym() != null)
        {
            node.getStringsym().apply(this);
        }
        outAStringSimplefactor(node);
    }

    public void inAIdentSimplefactor(AIdentSimplefactor node)
    {
        defaultIn(node);
    }

    public void outAIdentSimplefactor(AIdentSimplefactor node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIdentSimplefactor(AIdentSimplefactor node)
    {
        inAIdentSimplefactor(node);
        if(node.getIdent() != null)
        {
            node.getIdent().apply(this);
        }
        if(node.getArglst() != null)
        {
            node.getArglst().apply(this);
        }
        outAIdentSimplefactor(node);
    }

    public void inAIntNumfac(AIntNumfac node)
    {
        defaultIn(node);
    }

    public void outAIntNumfac(AIntNumfac node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntNumfac(AIntNumfac node)
    {
        inAIntNumfac(node);
        if(node.getIntdenotation() != null)
        {
            node.getIntdenotation().apply(this);
        }
        outAIntNumfac(node);
    }

    public void inARealNumfac(ARealNumfac node)
    {
        defaultIn(node);
    }

    public void outARealNumfac(ARealNumfac node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARealNumfac(ARealNumfac node)
    {
        inARealNumfac(node);
        if(node.getRealnum() != null)
        {
            node.getRealnum().apply(this);
        }
        outARealNumfac(node);
    }

    public void inAMonadNumfac(AMonadNumfac node)
    {
        defaultIn(node);
    }

    public void outAMonadNumfac(AMonadNumfac node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMonadNumfac(AMonadNumfac node)
    {
        inAMonadNumfac(node);
        if(node.getMonadexpr() != null)
        {
            node.getMonadexpr().apply(this);
        }
        outAMonadNumfac(node);
    }

    public void inAScnumRealnum(AScnumRealnum node)
    {
        defaultIn(node);
    }

    public void outAScnumRealnum(AScnumRealnum node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAScnumRealnum(AScnumRealnum node)
    {
        inAScnumRealnum(node);
        if(node.getBase() != null)
        {
            node.getBase().apply(this);
        }
        if(node.getEsym() != null)
        {
            node.getEsym().apply(this);
        }
        if(node.getExp() != null)
        {
            node.getExp().apply(this);
        }
        outAScnumRealnum(node);
    }

    public void inARealRealnum(ARealRealnum node)
    {
        defaultIn(node);
    }

    public void outARealRealnum(ARealRealnum node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARealRealnum(ARealRealnum node)
    {
        inARealRealnum(node);
        if(node.getRealdenotation() != null)
        {
            node.getRealdenotation().apply(this);
        }
        outARealRealnum(node);
    }

    public void inANegMonadexpr(ANegMonadexpr node)
    {
        defaultIn(node);
    }

    public void outANegMonadexpr(ANegMonadexpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANegMonadexpr(ANegMonadexpr node)
    {
        inANegMonadexpr(node);
        if(node.getMinussym() != null)
        {
            node.getMinussym().apply(this);
        }
        if(node.getFactorexpr() != null)
        {
            node.getFactorexpr().apply(this);
        }
        outANegMonadexpr(node);
    }

    public void inASucccharMonadexpr(ASucccharMonadexpr node)
    {
        defaultIn(node);
    }

    public void outASucccharMonadexpr(ASucccharMonadexpr node)
    {
        defaultOut(node);
    }

    @Override
    public void caseASucccharMonadexpr(ASucccharMonadexpr node)
    {
        inASucccharMonadexpr(node);
        if(node.getSuccsym() != null)
        {
            node.getSuccsym().apply(this);
        }
        if(node.getSimplefactor() != null)
        {
            node.getSimplefactor().apply(this);
        }
        outASucccharMonadexpr(node);
    }

    public void inAArgsArglst(AArgsArglst node)
    {
        defaultIn(node);
    }

    public void outAArgsArglst(AArgsArglst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAArgsArglst(AArgsArglst node)
    {
        inAArgsArglst(node);
        if(node.getLparsym() != null)
        {
            node.getLparsym().apply(this);
        }
        if(node.getArgs() != null)
        {
            node.getArgs().apply(this);
        }
        if(node.getRparsym() != null)
        {
            node.getRparsym().apply(this);
        }
        outAArgsArglst(node);
    }

    public void inAEmptyArglst(AEmptyArglst node)
    {
        defaultIn(node);
    }

    public void outAEmptyArglst(AEmptyArglst node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEmptyArglst(AEmptyArglst node)
    {
        inAEmptyArglst(node);
        if(node.getEmpty() != null)
        {
            node.getEmpty().apply(this);
        }
        outAEmptyArglst(node);
    }

    public void inAExprArgs(AExprArgs node)
    {
        defaultIn(node);
    }

    public void outAExprArgs(AExprArgs node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAExprArgs(AExprArgs node)
    {
        inAExprArgs(node);
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outAExprArgs(node);
    }

    public void inAListargsArgs(AListargsArgs node)
    {
        defaultIn(node);
    }

    public void outAListargsArgs(AListargsArgs node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAListargsArgs(AListargsArgs node)
    {
        inAListargsArgs(node);
        if(node.getArgs() != null)
        {
            node.getArgs().apply(this);
        }
        if(node.getCommasym() != null)
        {
            node.getCommasym().apply(this);
        }
        if(node.getExpr() != null)
        {
            node.getExpr().apply(this);
        }
        outAListargsArgs(node);
    }

    public void inAPlusAddop(APlusAddop node)
    {
        defaultIn(node);
    }

    public void outAPlusAddop(APlusAddop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAPlusAddop(APlusAddop node)
    {
        inAPlusAddop(node);
        if(node.getPlussym() != null)
        {
            node.getPlussym().apply(this);
        }
        outAPlusAddop(node);
    }

    public void inAMinusAddop(AMinusAddop node)
    {
        defaultIn(node);
    }

    public void outAMinusAddop(AMinusAddop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMinusAddop(AMinusAddop node)
    {
        inAMinusAddop(node);
        if(node.getMinussym() != null)
        {
            node.getMinussym().apply(this);
        }
        outAMinusAddop(node);
    }

    public void inAMultMulop(AMultMulop node)
    {
        defaultIn(node);
    }

    public void outAMultMulop(AMultMulop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAMultMulop(AMultMulop node)
    {
        inAMultMulop(node);
        if(node.getTimessym() != null)
        {
            node.getTimessym().apply(this);
        }
        outAMultMulop(node);
    }

    public void inADivMulop(ADivMulop node)
    {
        defaultIn(node);
    }

    public void outADivMulop(ADivMulop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseADivMulop(ADivMulop node)
    {
        inADivMulop(node);
        if(node.getDivsym() != null)
        {
            node.getDivsym().apply(this);
        }
        outADivMulop(node);
    }

    public void inAIntegermodMulop(AIntegermodMulop node)
    {
        defaultIn(node);
    }

    public void outAIntegermodMulop(AIntegermodMulop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAIntegermodMulop(AIntegermodMulop node)
    {
        inAIntegermodMulop(node);
        if(node.getImodsym() != null)
        {
            node.getImodsym().apply(this);
        }
        outAIntegermodMulop(node);
    }

    public void inALshiftMulop(ALshiftMulop node)
    {
        defaultIn(node);
    }

    public void outALshiftMulop(ALshiftMulop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALshiftMulop(ALshiftMulop node)
    {
        inALshiftMulop(node);
        if(node.getLshiftsym() != null)
        {
            node.getLshiftsym().apply(this);
        }
        outALshiftMulop(node);
    }

    public void inARshiftMulop(ARshiftMulop node)
    {
        defaultIn(node);
    }

    public void outARshiftMulop(ARshiftMulop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseARshiftMulop(ARshiftMulop node)
    {
        inARshiftMulop(node);
        if(node.getRshiftsym() != null)
        {
            node.getRshiftsym().apply(this);
        }
        outARshiftMulop(node);
    }

    public void inALessthanRelop(ALessthanRelop node)
    {
        defaultIn(node);
    }

    public void outALessthanRelop(ALessthanRelop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALessthanRelop(ALessthanRelop node)
    {
        inALessthanRelop(node);
        if(node.getLesssym() != null)
        {
            node.getLesssym().apply(this);
        }
        outALessthanRelop(node);
    }

    public void inALessorequalRelop(ALessorequalRelop node)
    {
        defaultIn(node);
    }

    public void outALessorequalRelop(ALessorequalRelop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseALessorequalRelop(ALessorequalRelop node)
    {
        inALessorequalRelop(node);
        if(node.getLseqsym() != null)
        {
            node.getLseqsym().apply(this);
        }
        outALessorequalRelop(node);
    }

    public void inAEqualRelop(AEqualRelop node)
    {
        defaultIn(node);
    }

    public void outAEqualRelop(AEqualRelop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEqualRelop(AEqualRelop node)
    {
        inAEqualRelop(node);
        if(node.getEqualsym() != null)
        {
            node.getEqualsym().apply(this);
        }
        outAEqualRelop(node);
    }

    public void inANotequalRelop(ANotequalRelop node)
    {
        defaultIn(node);
    }

    public void outANotequalRelop(ANotequalRelop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseANotequalRelop(ANotequalRelop node)
    {
        inANotequalRelop(node);
        if(node.getNoteqsym() != null)
        {
            node.getNoteqsym().apply(this);
        }
        outANotequalRelop(node);
    }

    public void inAGreaterequalRelop(AGreaterequalRelop node)
    {
        defaultIn(node);
    }

    public void outAGreaterequalRelop(AGreaterequalRelop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGreaterequalRelop(AGreaterequalRelop node)
    {
        inAGreaterequalRelop(node);
        if(node.getGreqsym() != null)
        {
            node.getGreqsym().apply(this);
        }
        outAGreaterequalRelop(node);
    }

    public void inAGreaterRelop(AGreaterRelop node)
    {
        defaultIn(node);
    }

    public void outAGreaterRelop(AGreaterRelop node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAGreaterRelop(AGreaterRelop node)
    {
        inAGreaterRelop(node);
        if(node.getGrtrsym() != null)
        {
            node.getGrtrsym().apply(this);
        }
        outAGreaterRelop(node);
    }

    public void inAEmpty(AEmpty node)
    {
        defaultIn(node);
    }

    public void outAEmpty(AEmpty node)
    {
        defaultOut(node);
    }

    @Override
    public void caseAEmpty(AEmpty node)
    {
        inAEmpty(node);
        outAEmpty(node);
    }
}
