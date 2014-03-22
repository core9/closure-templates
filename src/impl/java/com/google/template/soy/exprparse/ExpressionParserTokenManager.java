/* Generated By:JavaCC: Do not edit this line. ExpressionParserTokenManager.java */
package com.google.template.soy.exprparse;
import com.google.common.base.CharMatcher;
import com.google.common.base.Throwables;
import com.google.common.collect.Lists;
import com.google.template.soy.exprtree.BooleanNode;
import com.google.template.soy.exprtree.DataRefAccessExprNode;
import com.google.template.soy.exprtree.DataRefAccessIndexNode;
import com.google.template.soy.exprtree.DataRefAccessKeyNode;
import com.google.template.soy.exprtree.DataRefNode;
import com.google.template.soy.exprtree.ExprNode;
import com.google.template.soy.exprtree.ExprNode.OperatorNode;
import com.google.template.soy.exprtree.ExprNode.PrimitiveNode;
import com.google.template.soy.exprtree.ExprRootNode;
import com.google.template.soy.exprtree.FloatNode;
import com.google.template.soy.exprtree.FunctionNode;
import com.google.template.soy.exprtree.GlobalNode;
import com.google.template.soy.exprtree.IntegerNode;
import com.google.template.soy.exprtree.ListLiteralNode;
import com.google.template.soy.exprtree.MapLiteralNode;
import com.google.template.soy.exprtree.NullNode;
import com.google.template.soy.exprtree.Operator;
import com.google.template.soy.exprtree.OperatorNodes;
import com.google.template.soy.exprtree.OperatorNodes.ConditionalOpNode;
import com.google.template.soy.exprtree.OperatorNodes.NullCoalescingOpNode;
import com.google.template.soy.exprtree.StringNode;
import com.google.template.soy.exprtree.VarNode;
import com.google.template.soy.internal.base.UnescapeUtils;
import java.io.StringReader;
import java.util.List;

/** Token Manager. */
public class ExpressionParserTokenManager implements ExpressionParserConstants
{

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x202L) != 0L)
         {
            jjmatchedKind = 11;
            return 34;
         }
         if ((active0 & 0xc000000L) != 0L)
            return 36;
         if ((active0 & 0x10180000L) != 0L)
            return 64;
         return -1;
      case 1:
         if ((active0 & 0x202L) != 0L)
         {
            jjmatchedKind = 11;
            jjmatchedPos = 1;
            return 34;
         }
         if ((active0 & 0xc000000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 1;
            return 37;
         }
         return -1;
      case 2:
         if ((active0 & 0x200L) != 0L)
            return 34;
         if ((active0 & 0xc000000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 2;
            return 37;
         }
         if ((active0 & 0x2L) != 0L)
         {
            jjmatchedKind = 11;
            jjmatchedPos = 2;
            return 34;
         }
         return -1;
      case 3:
         if ((active0 & 0x2L) != 0L)
            return 34;
         if ((active0 & 0x8000000L) != 0L)
         {
            if (jjmatchedPos < 2)
            {
               jjmatchedKind = 12;
               jjmatchedPos = 2;
            }
            return -1;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 36:
         return jjMoveStringLiteralDfa1_0(0xc000000L);
      case 40:
         return jjStopAtPos(0, 22);
      case 41:
         return jjStopAtPos(0, 23);
      case 44:
         return jjStopAtPos(0, 18);
      case 45:
         return jjStopAtPos(0, 8);
      case 58:
         return jjStopAtPos(0, 21);
      case 63:
         jjmatchedKind = 20;
         return jjMoveStringLiteralDfa1_0(0x10080000L);
      case 91:
         return jjStopAtPos(0, 24);
      case 93:
         return jjStopAtPos(0, 25);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x202L);
      default :
         return jjMoveNfa_0(3, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 58:
         if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(1, 19);
         break;
      case 91:
         if ((active0 & 0x10000000L) != 0L)
            return jjStopAtPos(1, 28);
         break;
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0xc000000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x2L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 106:
         return jjMoveStringLiteralDfa3_0(active0, 0xc000000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x2L);
      case 116:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(2, 9, 34);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 46:
         if ((active0 & 0x4000000L) != 0L)
            return jjStopAtPos(3, 26);
         break;
      case 63:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000L);
      case 108:
         if ((active0 & 0x2L) != 0L)
            return jjStartNfaWithStates_0(3, 1, 34);
         break;
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 46:
         if ((active0 & 0x8000000L) != 0L)
            return jjStopAtPos(4, 27);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0xfffffffffffffffeL, 0xffffffffffffffffL, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static final long[] jjbitVec2 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 75;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 64:
                  if (curChar == 46)
                     jjCheckNAddStates(0, 2);
                  if (curChar == 46)
                     jjCheckNAddStates(3, 5);
                  break;
               case 3:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 3)
                        kind = 3;
                     jjCheckNAddStates(6, 10);
                  }
                  else if ((0x50008c2000000000L & l) != 0L)
                  {
                     if (kind > 10)
                        kind = 10;
                  }
                  else if ((0x100002600L & l) != 0L)
                  {
                     if (kind > 17)
                        kind = 17;
                  }
                  else if (curChar == 46)
                     jjCheckNAddStates(11, 16);
                  else if (curChar == 36)
                     jjstateSet[jjnewStateCnt++] = 36;
                  else if (curChar == 33)
                     jjCheckNAdd(23);
                  else if (curChar == 61)
                     jjCheckNAdd(23);
                  else if (curChar == 39)
                     jjCheckNAddStates(17, 20);
                  else if (curChar == 63)
                     jjAddStates(21, 22);
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 39;
                  else if (curChar == 62)
                     jjCheckNAdd(23);
                  else if (curChar == 60)
                     jjCheckNAdd(23);
                  else if (curChar == 48)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 3)
                     kind = 3;
                  jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 10:
                  if (curChar == 48)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 11:
                  if (curChar == 39)
                     jjCheckNAddStates(17, 20);
                  break;
               case 12:
                  if ((0xffffff7fffffdbffL & l) != 0L)
                     jjCheckNAddStates(17, 20);
                  break;
               case 14:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(17, 20);
                  break;
               case 16:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 17:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 18:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 19:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(17, 20);
                  break;
               case 21:
                  if (curChar == 39 && kind > 5)
                     kind = 5;
                  break;
               case 22:
                  if ((0x50008c2000000000L & l) != 0L && kind > 10)
                     kind = 10;
                  break;
               case 23:
                  if (curChar == 61 && kind > 10)
                     kind = 10;
                  break;
               case 24:
                  if (curChar == 60)
                     jjCheckNAdd(23);
                  break;
               case 25:
                  if (curChar == 62)
                     jjCheckNAdd(23);
                  break;
               case 26:
                  if (curChar == 61)
                     jjCheckNAdd(23);
                  break;
               case 27:
                  if (curChar == 33)
                     jjCheckNAdd(23);
                  break;
               case 34:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjstateSet[jjnewStateCnt++] = 34;
                  break;
               case 35:
                  if (curChar == 36)
                     jjstateSet[jjnewStateCnt++] = 36;
                  break;
               case 37:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 12)
                     kind = 12;
                  jjstateSet[jjnewStateCnt++] = 37;
                  break;
               case 38:
                  if ((0x100002600L & l) != 0L && kind > 17)
                     kind = 17;
                  break;
               case 39:
                  if (curChar == 10 && kind > 17)
                     kind = 17;
                  break;
               case 40:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 39;
                  break;
               case 41:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 3)
                     kind = 3;
                  jjCheckNAddStates(6, 10);
                  break;
               case 42:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 3)
                     kind = 3;
                  jjCheckNAdd(42);
                  break;
               case 43:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(43, 44);
                  break;
               case 44:
                  if (curChar == 46)
                     jjCheckNAdd(45);
                  break;
               case 45:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 4)
                     kind = 4;
                  jjCheckNAddTwoStates(45, 46);
                  break;
               case 47:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(48);
                  break;
               case 48:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 4)
                     kind = 4;
                  jjCheckNAdd(48);
                  break;
               case 49:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(49, 50);
                  break;
               case 51:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(52);
                  break;
               case 52:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 4)
                     kind = 4;
                  jjCheckNAdd(52);
                  break;
               case 53:
                  if (curChar == 46)
                     jjCheckNAddStates(11, 16);
                  break;
               case 54:
                  if ((0x100002600L & l) != 0L)
                     jjCheckNAddStates(23, 25);
                  break;
               case 55:
                  if (curChar == 10)
                     jjCheckNAddStates(23, 25);
                  break;
               case 56:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 55;
                  break;
               case 58:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjstateSet[jjnewStateCnt++] = 58;
                  break;
               case 59:
                  if ((0x100002600L & l) != 0L)
                     jjCheckNAddStates(26, 28);
                  break;
               case 60:
                  if (curChar == 10)
                     jjCheckNAddStates(26, 28);
                  break;
               case 61:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 60;
                  break;
               case 62:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 15)
                     kind = 15;
                  jjCheckNAdd(62);
                  break;
               case 63:
                  if (curChar == 63)
                     jjAddStates(21, 22);
                  break;
               case 65:
                  if ((0x100002600L & l) != 0L)
                     jjCheckNAddStates(3, 5);
                  break;
               case 66:
                  if (curChar == 10)
                     jjCheckNAddStates(3, 5);
                  break;
               case 67:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 66;
                  break;
               case 69:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 14)
                     kind = 14;
                  jjstateSet[jjnewStateCnt++] = 69;
                  break;
               case 70:
                  if (curChar == 46)
                     jjCheckNAddStates(0, 2);
                  break;
               case 71:
                  if ((0x100002600L & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 72:
                  if (curChar == 10)
                     jjCheckNAddStates(0, 2);
                  break;
               case 73:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 72;
                  break;
               case 74:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 16)
                     kind = 16;
                  jjCheckNAdd(74);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if ((0x7fffffe87fffffeL & l) != 0L)
                  {
                     if (kind > 11)
                        kind = 11;
                     jjCheckNAdd(34);
                  }
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 31;
                  else if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 29;
                  else if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 6;
                  else if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 2;
                  break;
               case 0:
                  if (curChar == 101 && kind > 2)
                     kind = 2;
                  break;
               case 1:
                  if (curChar == 117)
                     jjCheckNAdd(0);
                  break;
               case 2:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 1;
                  break;
               case 4:
                  if (curChar == 115)
                     jjCheckNAdd(0);
                  break;
               case 5:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 6:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 8:
                  if (curChar == 120)
                     jjCheckNAdd(9);
                  break;
               case 9:
                  if ((0x7eL & l) == 0L)
                     break;
                  if (kind > 3)
                     kind = 3;
                  jjCheckNAdd(9);
                  break;
               case 12:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(17, 20);
                  break;
               case 13:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 14;
                  break;
               case 14:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(17, 20);
                  break;
               case 15:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 16:
                  if ((0x7eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 17:
                  if ((0x7eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 18:
                  if ((0x7eL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 19:
                  if ((0x7eL & l) != 0L)
                     jjCheckNAddStates(17, 20);
                  break;
               case 20:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 28:
                  if (curChar == 100 && kind > 10)
                     kind = 10;
                  break;
               case 29:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 30:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 31:
                  if (curChar == 114 && kind > 10)
                     kind = 10;
                  break;
               case 32:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 31;
                  break;
               case 33:
               case 34:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAdd(34);
                  break;
               case 36:
               case 37:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 12)
                     kind = 12;
                  jjCheckNAdd(37);
                  break;
               case 46:
                  if (curChar == 101)
                     jjAddStates(29, 30);
                  break;
               case 50:
                  if (curChar == 101)
                     jjAddStates(31, 32);
                  break;
               case 57:
               case 58:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjCheckNAdd(58);
                  break;
               case 68:
               case 69:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 14)
                     kind = 14;
                  jjCheckNAdd(69);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 12:
                  if (jjCanMove_0(hiByte, i1, i2, l1, l2))
                     jjAddStates(17, 20);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 75 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   71, 73, 74, 65, 67, 68, 42, 43, 44, 49, 50, 54, 56, 57, 59, 61, 
   62, 12, 13, 20, 21, 64, 70, 54, 56, 57, 59, 61, 62, 47, 48, 51, 
   52, 
};
private static final boolean jjCanMove_0(int hiByte, int i1, int i2, long l1, long l2)
{
   switch(hiByte)
   {
      case 0:
         return ((jjbitVec2[i2] & l2) != 0L);
      default :
         if ((jjbitVec0[i1] & l1) != 0L)
            return true;
         return false;
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", "\156\165\154\154", null, null, null, null, null, null, "\55", 
"\156\157\164", null, null, null, null, null, null, null, null, "\54", "\77\72", "\77", "\72", 
"\50", "\51", "\133", "\135", "\44\151\152\56", "\44\151\152\77\56", "\77\133", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x1ffdff3fL, 
};
static final long[] jjtoSkip = {
   0x20000L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[75];
private final int[] jjstateSet = new int[150];
private final StringBuilder jjimage = new StringBuilder();
private StringBuilder image = jjimage;
private int jjimageLen;
private int lengthOfMatch;
protected char curChar;
/** Constructor. */
public ExpressionParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public ExpressionParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 75; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         TokenLexicalActions(matchedToken);
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 13 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    matchedToken.image = CharMatcher.WHITESPACE.removeFrom(image.toString());
         break;
      case 14 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    matchedToken.image = CharMatcher.WHITESPACE.removeFrom(image.toString());
         break;
      case 15 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    matchedToken.image = CharMatcher.WHITESPACE.removeFrom(image.toString());
         break;
      case 16 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    matchedToken.image = CharMatcher.WHITESPACE.removeFrom(image.toString());
         break;
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
