/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Dec 11 19:05:28 GMT 2014
 */

package org.apache.commons.math.optimization.fitting;

import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;

public class GaussianFitterEvoSuite_branch_Test_scaffolding {

  @org.junit.Rule 
  public org.junit.rules.Timeout globalTimeout = new org.junit.rules.Timeout(6000); 

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 5000);
  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    resetClasses(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("java.vm.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.specification.version", "1.7"); 
            java.lang.System.setProperty("java.home", "/usr/local/packages6/java/jdk1.7.0_55/jre"); 
    java.lang.System.setProperty("user.dir", "/scratch/ac1gf/Math/58/6/run_evosuite.pl_12561_1418324104"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
            java.lang.System.setProperty("awt.toolkit", "sun.awt.X11.XToolkit"); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("file.separator", "/"); 
        java.lang.System.setProperty("java.awt.graphicsenv", "sun.awt.X11GraphicsEnvironment"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.awt.printerjob", "sun.print.PSPrinterJob"); 
    java.lang.System.setProperty("java.class.path", "/data/ac1gf/defects4j/framework/projects/lib/evosuite.jar:/scratch/ac1gf/Math/58/6/run_evosuite.pl_12561_1418324104/target/classes"); 
    java.lang.System.setProperty("java.class.version", "51.0"); 
        java.lang.System.setProperty("java.endorsed.dirs", "/usr/local/packages6/java/jdk1.7.0_55/jre/lib/endorsed"); 
    java.lang.System.setProperty("java.ext.dirs", "/usr/local/packages6/java/jdk1.7.0_55/jre/lib/ext:/usr/java/packages/lib/ext"); 
    java.lang.System.setProperty("java.library.path", "lib"); 
    java.lang.System.setProperty("java.runtime.name", "Java(TM) SE Runtime Environment"); 
    java.lang.System.setProperty("java.runtime.version", "1.7.0_55-b13"); 
    java.lang.System.setProperty("java.specification.name", "Java Platform API Specification"); 
    java.lang.System.setProperty("java.specification.vendor", "Oracle Corporation"); 
        java.lang.System.setProperty("java.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.vendor.url", "http://java.oracle.com/"); 
    java.lang.System.setProperty("java.version", "1.7.0_55"); 
    java.lang.System.setProperty("java.vm.info", "mixed mode"); 
    java.lang.System.setProperty("java.vm.name", "Java HotSpot(TM) 64-Bit Server VM"); 
    java.lang.System.setProperty("java.vm.specification.name", "Java Virtual Machine Specification"); 
    java.lang.System.setProperty("java.vm.specification.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.vm.specification.version", "1.7"); 
    java.lang.System.setProperty("java.vm.version", "24.55-b03"); 
    java.lang.System.setProperty("line.separator", "\n"); 
    java.lang.System.setProperty("os.arch", "amd64"); 
    java.lang.System.setProperty("os.name", "Linux"); 
    java.lang.System.setProperty("os.version", "2.6.32-431.23.3.el6.x86_64"); 
    java.lang.System.setProperty("path.separator", ":"); 
    java.lang.System.setProperty("user.country", "GB"); 
    java.lang.System.setProperty("user.home", "/home/ac1gf"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ac1gf"); 
    java.lang.System.setProperty("user.timezone", "Europe/Belfast"); 
      }

  private static void initializeClasses() {
    org.evosuite.runtime.ClassStateSupport.initializeClasses(GaussianFitterEvoSuite_branch_Test_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math.analysis.function.Log",
      "org.apache.commons.math.random.Well44497a",
      "org.apache.commons.math.random.GaussianRandomGenerator",
      "org.apache.commons.math.random.Well44497b",
      "org.apache.commons.math.linear.BlockFieldMatrix",
      "org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction",
      "org.apache.commons.math.linear.DefaultRealMatrixPreservingVisitor",
      "org.apache.commons.math.MathRuntimeException",
      "org.apache.commons.math.random.UniformRandomGenerator",
      "org.apache.commons.math.MathRuntimeException$7",
      "org.apache.commons.math.MathRuntimeException$8",
      "org.apache.commons.math.MathRuntimeException$9",
      "org.apache.commons.math.analysis.BivariateRealFunction",
      "org.apache.commons.math.analysis.function.Cosh",
      "org.apache.commons.math.MathRuntimeException$3",
      "org.apache.commons.math.MathRuntimeException$4",
      "org.apache.commons.math.MathRuntimeException$5",
      "org.apache.commons.math.analysis.MultivariateMatrixFunction",
      "org.apache.commons.math.linear.OpenMapRealVector",
      "org.apache.commons.math.MathRuntimeException$6",
      "org.apache.commons.math.linear.OpenMapRealMatrix",
      "org.apache.commons.math.exception.util.LocalizedFormats",
      "org.apache.commons.math.linear.FieldMatrix",
      "org.apache.commons.math.MathRuntimeException$1",
      "org.apache.commons.math.MathRuntimeException$2",
      "org.apache.commons.math.analysis.function.Sin",
      "org.apache.commons.math.optimization.BaseMultivariateVectorialOptimizer",
      "org.apache.commons.math.analysis.function.StepFunction",
      "org.apache.commons.math.MathRuntimeException$11",
      "org.apache.commons.math.MathRuntimeException$10",
      "org.apache.commons.math.exception.OutOfRangeException",
      "org.apache.commons.math.linear.AbstractRealVector$1",
      "org.apache.commons.math.optimization.fitting.CurveFitter",
      "org.apache.commons.math.analysis.polynomials.PolynomialFunction",
      "org.apache.commons.math.optimization.DifferentiableMultivariateVectorialOptimizer",
      "org.apache.commons.math.analysis.function.Tanh",
      "org.apache.commons.math.analysis.UnivariateRealFunction",
      "org.apache.commons.math.random.RandomAdaptor",
      "org.apache.commons.math.optimization.MultiStartDifferentiableMultivariateVectorialOptimizer",
      "org.apache.commons.math.random.Well1024a",
      "org.apache.commons.math.linear.AbstractRealVector$EntryImpl",
      "org.apache.commons.math.analysis.function.Asinh",
      "org.apache.commons.math.exception.ConvergenceException",
      "org.apache.commons.math.analysis.function.Signum",
      "org.apache.commons.math.analysis.function.Ceil",
      "org.apache.commons.math.analysis.function.Atan",
      "org.apache.commons.math.analysis.function.Cos",
      "org.apache.commons.math.exception.NotStrictlyPositiveException",
      "org.apache.commons.math.util.OpenIntToDoubleHashMap",
      "org.apache.commons.math.analysis.function.Log1p",
      "org.apache.commons.math.analysis.function.Inverse",
      "org.apache.commons.math.analysis.function.Logistic",
      "org.apache.commons.math.linear.AnyMatrix",
      "org.apache.commons.math.exception.MatrixDimensionMismatchException",
      "org.apache.commons.math.linear.RealMatrixChangingVisitor",
      "org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser",
      "org.apache.commons.math.exception.NoDataException",
      "org.apache.commons.math.exception.MathParseException",
      "org.apache.commons.math.optimization.fitting.GaussianFitter",
      "org.apache.commons.math.util.FastMath",
      "org.apache.commons.math.analysis.function.Constant",
      "org.apache.commons.math.exception.util.MessageFactory",
      "org.apache.commons.math.analysis.function.Gaussian",
      "org.apache.commons.math.linear.AbstractRealVector$SparseEntryIterator",
      "org.apache.commons.math.exception.MathIllegalArgumentException",
      "org.apache.commons.math.analysis.function.Sinh",
      "org.apache.commons.math.exception.MathUnsupportedOperationException",
      "org.apache.commons.math.optimization.BaseMultiStartMultivariateVectorialOptimizer",
      "org.apache.commons.math.linear.RealVector",
      "org.apache.commons.math.exception.NumberIsTooLargeException",
      "org.apache.commons.math.analysis.function.HarmonicOscillator$Parametric",
      "org.apache.commons.math.analysis.ParametricUnivariateRealFunction",
      "org.apache.commons.math.analysis.function.Gaussian$Parametric",
      "org.apache.commons.math.analysis.FunctionUtils",
      "org.apache.commons.math.analysis.function.Sinc",
      "org.apache.commons.math.linear.RealMatrixPreservingVisitor",
      "org.apache.commons.math.analysis.function.Rint",
      "org.apache.commons.math.linear.BlockRealMatrix",
      "org.apache.commons.math.util.OpenIntToDoubleHashMap$Iterator",
      "org.apache.commons.math.exception.util.Localizable",
      "org.apache.commons.math.linear.AbstractFieldMatrix",
      "org.apache.commons.math.analysis.MultivariateRealFunction",
      "org.apache.commons.math.analysis.polynomials.PolynomialSplineFunction",
      "org.apache.commons.math.linear.FieldMatrixPreservingVisitor",
      "org.apache.commons.math.analysis.function.Asin",
      "org.apache.commons.math.exception.MathThrowable",
      "org.apache.commons.math.linear.Array2DRowFieldMatrix",
      "org.apache.commons.math.optimization.SimpleScalarValueChecker",
      "org.apache.commons.math.linear.SparseRealMatrix",
      "org.apache.commons.math.analysis.function.Tan",
      "org.apache.commons.math.linear.RealMatrix",
      "org.apache.commons.math.exception.NumberIsTooSmallException",
      "org.apache.commons.math.analysis.MultivariateVectorialFunction",
      "org.apache.commons.math.linear.OpenMapRealVector$OpenMapSparseIterator",
      "org.apache.commons.math.optimization.BaseOptimizer",
      "org.apache.commons.math.exception.MultiDimensionMismatchException",
      "org.apache.commons.math.analysis.function.Atanh",
      "org.apache.commons.math.linear.SparseRealVector",
      "org.apache.commons.math.util.CompositeFormat",
      "org.apache.commons.math.analysis.function.Expm1",
      "org.apache.commons.math.random.CorrelatedRandomVectorGenerator",
      "org.apache.commons.math.exception.MathUserException",
      "org.apache.commons.math.exception.MathIllegalStateException",
      "org.apache.commons.math.analysis.function.Sqrt",
      "org.apache.commons.math.exception.NullArgumentException",
      "org.apache.commons.math.analysis.function.Log10",
      "org.apache.commons.math.linear.RealVector$Entry",
      "org.apache.commons.math.random.Well19937c",
      "org.apache.commons.math.random.Well19937a",
      "org.apache.commons.math.exception.DimensionMismatchException",
      "org.apache.commons.math.optimization.SimpleRealPointChecker",
      "org.apache.commons.math.analysis.function.HarmonicOscillator",
      "org.apache.commons.math.optimization.ConvergenceChecker",
      "org.apache.commons.math.linear.AbstractRealVector",
      "org.apache.commons.math.random.MersenneTwister",
      "org.apache.commons.math.random.AbstractRandomGenerator",
      "org.apache.commons.math.optimization.SimpleVectorialPointChecker",
      "org.apache.commons.math.random.BitsStreamGenerator",
      "org.apache.commons.math.exception.MathRuntimeException",
      "org.apache.commons.math.analysis.function.Cbrt",
      "org.apache.commons.math.random.RandomVectorGenerator",
      "org.apache.commons.math.analysis.polynomials.PolynomialFunctionLagrangeForm",
      "org.apache.commons.math.analysis.function.Abs",
      "org.apache.commons.math.optimization.AbstractConvergenceChecker",
      "org.apache.commons.math.exception.MathArithmeticException",
      "org.apache.commons.math.analysis.function.Ulp",
      "org.apache.commons.math.random.UncorrelatedRandomVectorGenerator",
      "org.apache.commons.math.random.Well512a",
      "org.apache.commons.math.optimization.SimpleVectorialValueChecker",
      "org.apache.commons.math.linear.MatrixUtils",
      "org.apache.commons.math.analysis.function.Identity",
      "org.apache.commons.math.linear.ArrayRealVector",
      "org.apache.commons.math.linear.DefaultRealMatrixChangingVisitor",
      "org.apache.commons.math.linear.FieldVector",
      "org.apache.commons.math.linear.Array2DRowRealMatrix",
      "org.apache.commons.math.linear.AbstractRealMatrix$5",
      "org.apache.commons.math.optimization.fitting.GaussianFitter$ParameterGuesser$1",
      "org.apache.commons.math.analysis.function.Sigmoid",
      "org.apache.commons.math.random.JDKRandomGenerator",
      "org.apache.commons.math.optimization.fitting.WeightedObservedPoint",
      "org.apache.commons.math.analysis.function.Multiply",
      "org.apache.commons.math.exception.ZeroException",
      "org.apache.commons.math.analysis.FunctionUtils$7",
      "org.apache.commons.math.random.NormalizedRandomGenerator",
      "org.apache.commons.math.linear.AbstractRealMatrix$3",
      "org.apache.commons.math.random.AbstractWell",
      "org.apache.commons.math.analysis.function.Exp",
      "org.apache.commons.math.linear.RealVectorFormat",
      "org.apache.commons.math.optimization.fitting.GaussianFitter$1",
      "org.apache.commons.math.random.RandomGenerator",
      "org.apache.commons.math.exception.util.ArgUtils",
      "org.apache.commons.math.exception.MathIllegalNumberException",
      "org.apache.commons.math.optimization.VectorialPointValuePair",
      "org.apache.commons.math.linear.OpenMapRealVector$OpenMapEntry",
      "org.apache.commons.math.analysis.function.Divide",
      "org.apache.commons.math.exception.NonPositiveDefiniteMatrixException",
      "org.apache.commons.math.analysis.function.Acos",
      "org.apache.commons.math.random.UnitSphereRandomVectorGenerator",
      "org.apache.commons.math.analysis.DifferentiableMultivariateVectorialFunction",
      "org.apache.commons.math.exception.NonSquareMatrixException",
      "org.apache.commons.math.analysis.function.Power",
      "org.apache.commons.math.linear.AbstractRealMatrix",
      "org.apache.commons.math.analysis.function.Acosh",
      "org.apache.commons.math.analysis.function.Floor",
      "org.apache.commons.math.analysis.DifferentiableUnivariateRealFunction",
      "org.apache.commons.math.optimization.RealPointValuePair",
      "org.apache.commons.math.analysis.polynomials.PolynomialFunctionNewtonForm",
      "org.apache.commons.math.analysis.function.Minus"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.reset.ClassResetter.getInstance().setClassLoader(GaussianFitterEvoSuite_branch_Test_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.ClassStateSupport.resetClasses(
      "org.apache.commons.math.optimization.fitting.WeightedObservedPoint",
      "org.apache.commons.math.exception.MathRuntimeException",
      "org.apache.commons.math.exception.MathIllegalArgumentException",
      "org.apache.commons.math.exception.MathIllegalNumberException",
      "org.apache.commons.math.exception.DimensionMismatchException",
      "org.apache.commons.math.exception.util.LocalizedFormats",
      "org.apache.commons.math.linear.Array2DRowRealMatrix",
      "org.apache.commons.math.linear.BlockRealMatrix",
      "org.apache.commons.math.exception.NumberIsTooSmallException",
      "org.apache.commons.math.exception.NotStrictlyPositiveException",
      "org.apache.commons.math.exception.OutOfRangeException",
      "org.apache.commons.math.random.MersenneTwister",
      "org.apache.commons.math.util.FastMath",
      "org.apache.commons.math.exception.NullArgumentException",
      "org.apache.commons.math.random.AbstractWell",
      "org.apache.commons.math.random.Well19937a",
      "org.apache.commons.math.random.Well44497b",
      "org.apache.commons.math.random.UniformRandomGenerator",
      "org.apache.commons.math.random.Well19937c",
      "org.apache.commons.math.linear.RealVectorFormat",
      "org.apache.commons.math.util.CompositeFormat",
      "org.apache.commons.math.linear.ArrayRealVector",
      "org.apache.commons.math.random.Well512a",
      "org.apache.commons.math.random.Well1024a",
      "org.apache.commons.math.exception.MultiDimensionMismatchException",
      "org.apache.commons.math.exception.MatrixDimensionMismatchException",
      "org.apache.commons.math.random.Well44497a",
      "org.apache.commons.math.linear.OpenMapRealMatrix",
      "org.apache.commons.math.linear.OpenMapRealVector",
      "org.apache.commons.math.util.OpenIntToDoubleHashMap",
      "org.apache.commons.math.exception.NonPositiveDefiniteMatrixException",
      "org.apache.commons.math.random.RandomAdaptor",
      "org.apache.commons.math.exception.NumberIsTooLargeException",
      "org.apache.commons.math.random.JDKRandomGenerator",
      "org.apache.commons.math.MathRuntimeException",
      "org.apache.commons.math.MathRuntimeException$7",
      "org.apache.commons.math.optimization.AbstractConvergenceChecker",
      "org.apache.commons.math.exception.MathIllegalStateException",
      "org.apache.commons.math.exception.NoDataException"
    );
  }
}
