// This is a generated file. Not intended for manual editing.
package com.goide.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface GoForStatement extends GoCompositeElement {

  @Nullable
  GoBlock getBlock();

  @Nullable
  GoExpression getExpression();

  @Nullable
  GoForClause getForClause();

  @Nullable
  GoRangeClause getRangeClause();

  @NotNull
  PsiElement getFor();

}