/*
 * This file was automatically generated by EvoSuite
 * Thu Dec 11 22:38:43 GMT 2014
 */

package org.apache.commons.math.linear;

import static org.junit.Assert.*;
import org.junit.Test;
import org.apache.commons.math.MathRuntimeException;
import org.apache.commons.math.linear.Array2DRowRealMatrix;
import org.apache.commons.math.linear.BlockRealMatrix;
import org.apache.commons.math.linear.DecompositionSolver;
import org.apache.commons.math.linear.OpenMapRealMatrix;
import org.apache.commons.math.linear.RealMatrix;
import org.apache.commons.math.linear.SingularValueDecompositionImpl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, resetStaticState = true) 
public class SingularValueDecompositionImplEvoSuite_branch_Test extends SingularValueDecompositionImplEvoSuite_branch_Test_scaffolding {

  @Test
  public void test0()  throws Throwable  {
      double[][] doubleArray0 = new double[1][7];
      double[] doubleArray1 = new double[1];
      double double0 = (-1.0);
      doubleArray1[0] = double0;
      doubleArray0[0] = doubleArray1;
      assertNotNull(doubleArray0[0]);
      
      BlockRealMatrix blockRealMatrix0 = new BlockRealMatrix(doubleArray0);
      assertEquals(1, blockRealMatrix0.getColumnDimension());
      assertEquals(1, blockRealMatrix0.getRowDimension());
      assertEquals(1.0, blockRealMatrix0.getFrobeniusNorm(), 0.01D);
      assertEquals(true, blockRealMatrix0.isSquare());
      assertNotNull(blockRealMatrix0);
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) blockRealMatrix0);
      assertEquals(1, blockRealMatrix0.getColumnDimension());
      assertEquals(1, blockRealMatrix0.getRowDimension());
      assertEquals(1.0, blockRealMatrix0.getFrobeniusNorm(), 0.01D);
      assertEquals(true, blockRealMatrix0.isSquare());
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertEquals(1.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertNotNull(singularValueDecompositionImpl0);
      
      DecompositionSolver decompositionSolver0 = singularValueDecompositionImpl0.getSolver();
      assertEquals(1, blockRealMatrix0.getColumnDimension());
      assertEquals(1, blockRealMatrix0.getRowDimension());
      assertEquals(1.0, blockRealMatrix0.getFrobeniusNorm(), 0.01D);
      assertEquals(true, blockRealMatrix0.isSquare());
      assertEquals(1.0, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(1, singularValueDecompositionImpl0.getRank());
      assertEquals(1.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(true, decompositionSolver0.isNonSingular());
      assertNotNull(decompositionSolver0);
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = 88;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int0, int0);
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(88, openMapRealMatrix0.getRowDimension());
      assertEquals(88, openMapRealMatrix0.getColumnDimension());
      assertNotNull(openMapRealMatrix0);
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) openMapRealMatrix0);
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(88, openMapRealMatrix0.getRowDimension());
      assertEquals(88, openMapRealMatrix0.getColumnDimension());
      assertEquals(0.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertNotNull(singularValueDecompositionImpl0);
      
      // Undeclared exception!
      try {
        RealMatrix realMatrix0 = singularValueDecompositionImpl0.getCovariance((double) int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cutoff singular value is 88, should be at most 0
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      double[] doubleArray0 = new double[2];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      assertEquals(2, array2DRowRealMatrix0.getRowDimension());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(array2DRowRealMatrix0);
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) array2DRowRealMatrix0);
      assertEquals(0.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(2, array2DRowRealMatrix0.getRowDimension());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(singularValueDecompositionImpl0);
      
      Array2DRowRealMatrix array2DRowRealMatrix1 = (Array2DRowRealMatrix)singularValueDecompositionImpl0.getVT();
      assertNotSame(array2DRowRealMatrix1, array2DRowRealMatrix0);
      assertNotSame(array2DRowRealMatrix0, array2DRowRealMatrix1);
      assertEquals(true, array2DRowRealMatrix1.isSquare());
      assertEquals(1, array2DRowRealMatrix1.getRowDimension());
      assertEquals(1, array2DRowRealMatrix1.getColumnDimension());
      assertEquals(0.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(2, array2DRowRealMatrix0.getRowDimension());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(array2DRowRealMatrix1.equals((Object)array2DRowRealMatrix0));
      assertFalse(array2DRowRealMatrix0.equals((Object)array2DRowRealMatrix1));
      assertNotNull(array2DRowRealMatrix1);
      
      Array2DRowRealMatrix array2DRowRealMatrix2 = (Array2DRowRealMatrix)singularValueDecompositionImpl0.getCovariance(doubleArray0[1]);
      assertNotSame(array2DRowRealMatrix2, array2DRowRealMatrix0);
      assertNotSame(array2DRowRealMatrix2, array2DRowRealMatrix1);
      assertNotSame(array2DRowRealMatrix0, array2DRowRealMatrix1);
      assertNotSame(array2DRowRealMatrix0, array2DRowRealMatrix2);
      assertEquals(true, array2DRowRealMatrix2.isSquare());
      assertEquals(1, array2DRowRealMatrix2.getColumnDimension());
      assertEquals(1, array2DRowRealMatrix2.getRowDimension());
      assertEquals(0.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(2, array2DRowRealMatrix0.getRowDimension());
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertArrayEquals(new double[] {0.0, 0.0}, doubleArray0, 0.01);
      assertFalse(array2DRowRealMatrix2.equals((Object)array2DRowRealMatrix0));
      assertFalse(array2DRowRealMatrix2.equals((Object)array2DRowRealMatrix1));
      assertFalse(array2DRowRealMatrix0.equals((Object)array2DRowRealMatrix1));
      assertFalse(array2DRowRealMatrix0.equals((Object)array2DRowRealMatrix2));
      assertNotNull(array2DRowRealMatrix2);
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = 88;
      OpenMapRealMatrix openMapRealMatrix0 = new OpenMapRealMatrix(int0, int0);
      assertEquals(88, openMapRealMatrix0.getColumnDimension());
      assertEquals(88, openMapRealMatrix0.getRowDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertNotNull(openMapRealMatrix0);
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) openMapRealMatrix0);
      assertEquals(88, openMapRealMatrix0.getColumnDimension());
      assertEquals(88, openMapRealMatrix0.getRowDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(0.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertNotNull(singularValueDecompositionImpl0);
      
      BlockRealMatrix blockRealMatrix0 = (BlockRealMatrix)singularValueDecompositionImpl0.getS();
      assertEquals(88, openMapRealMatrix0.getColumnDimension());
      assertEquals(88, openMapRealMatrix0.getRowDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(true, blockRealMatrix0.isSquare());
      assertEquals(88, blockRealMatrix0.getColumnDimension());
      assertEquals(88, blockRealMatrix0.getRowDimension());
      assertEquals(0.0, blockRealMatrix0.getFrobeniusNorm(), 0.01D);
      assertEquals(0.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertNotNull(blockRealMatrix0);
      
      BlockRealMatrix blockRealMatrix1 = (BlockRealMatrix)singularValueDecompositionImpl0.getS();
      assertSame(blockRealMatrix1, blockRealMatrix0);
      assertEquals(0.0, blockRealMatrix1.getFrobeniusNorm(), 0.01D);
      assertEquals(88, blockRealMatrix1.getColumnDimension());
      assertEquals(88, blockRealMatrix1.getRowDimension());
      assertEquals(true, blockRealMatrix1.isSquare());
      assertEquals(88, openMapRealMatrix0.getColumnDimension());
      assertEquals(88, openMapRealMatrix0.getRowDimension());
      assertEquals(true, openMapRealMatrix0.isSquare());
      assertEquals(0.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertNotNull(blockRealMatrix1);
  }

  @Test
  public void test4()  throws Throwable  {
      double[][] doubleArray0 = new double[1][7];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(7, array2DRowRealMatrix0.getColumnDimension());
      assertNotNull(array2DRowRealMatrix0);
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) array2DRowRealMatrix0);
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(7, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertEquals(0.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertNotNull(singularValueDecompositionImpl0);
      
      DecompositionSolver decompositionSolver0 = singularValueDecompositionImpl0.getSolver();
      assertEquals(false, decompositionSolver0.isNonSingular());
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(7, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertEquals(0.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertNotNull(decompositionSolver0);
      
      DecompositionSolver decompositionSolver1 = singularValueDecompositionImpl0.getSolver();
      assertNotSame(decompositionSolver1, decompositionSolver0);
      assertEquals(1, array2DRowRealMatrix0.getRowDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(7, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(false, decompositionSolver1.isNonSingular());
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertEquals(0.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertFalse(decompositionSolver1.equals((Object)decompositionSolver0));
      assertNotNull(decompositionSolver1);
  }

  @Test
  public void test5()  throws Throwable  {
      double[][] doubleArray0 = new double[8][10];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(10, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(8, array2DRowRealMatrix0.getRowDimension());
      assertNotNull(array2DRowRealMatrix0);
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) array2DRowRealMatrix0);
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertEquals(0.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(10, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(8, array2DRowRealMatrix0.getRowDimension());
      assertNotNull(singularValueDecompositionImpl0);
      
      double double0 = singularValueDecompositionImpl0.getConditionNumber();
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertEquals(0.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(10, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(8, array2DRowRealMatrix0.getRowDimension());
      assertEquals(Double.NaN, double0, 0.01D);
  }

  @Test
  public void test6()  throws Throwable  {
      double[] doubleArray0 = new double[7];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(7, array2DRowRealMatrix0.getRowDimension());
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(array2DRowRealMatrix0);
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) array2DRowRealMatrix0);
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(7, array2DRowRealMatrix0.getRowDimension());
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertEquals(0.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertNotNull(singularValueDecompositionImpl0);
      
      double[] doubleArray1 = singularValueDecompositionImpl0.getSingularValues();
      assertNotSame(doubleArray0, doubleArray1);
      assertNotSame(doubleArray1, doubleArray0);
      assertEquals(1, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(7, array2DRowRealMatrix0.getRowDimension());
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertEquals(0.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertArrayEquals(new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0}, doubleArray0, 0.01);
      assertArrayEquals(new double[] {0.0}, doubleArray1, 0.01);
      assertFalse(doubleArray0.equals((Object)doubleArray1));
      assertFalse(doubleArray1.equals((Object)doubleArray0));
      assertNotNull(doubleArray1);
  }

  @Test
  public void test7()  throws Throwable  {
      double[][] doubleArray0 = new double[8][10];
      Array2DRowRealMatrix array2DRowRealMatrix0 = new Array2DRowRealMatrix(doubleArray0);
      assertEquals(8, array2DRowRealMatrix0.getRowDimension());
      assertEquals(10, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertNotNull(array2DRowRealMatrix0);
      
      SingularValueDecompositionImpl singularValueDecompositionImpl0 = new SingularValueDecompositionImpl((RealMatrix) array2DRowRealMatrix0);
      assertEquals(0.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertEquals(8, array2DRowRealMatrix0.getRowDimension());
      assertEquals(10, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertNotNull(singularValueDecompositionImpl0);
      
      double double0 = singularValueDecompositionImpl0.getNorm();
      assertEquals(0.0, singularValueDecompositionImpl0.getNorm(), 0.01D);
      assertEquals(Double.NaN, singularValueDecompositionImpl0.getConditionNumber(), 0.01D);
      assertEquals(0, singularValueDecompositionImpl0.getRank());
      assertEquals(8, array2DRowRealMatrix0.getRowDimension());
      assertEquals(10, array2DRowRealMatrix0.getColumnDimension());
      assertEquals(false, array2DRowRealMatrix0.isSquare());
      assertEquals(0.0, double0, 0.01D);
  }
}