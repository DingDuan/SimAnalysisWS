/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Nov 30 05:54:21 GMT 2019
 */

package net.mooctest;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class DenseWeightedGraph_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "net.mooctest.DenseWeightedGraph"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "GBK"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\Administrator\\AppData\\Local\\Temp\\"); 
    java.lang.System.setProperty("user.country", "CN"); 
    java.lang.System.setProperty("user.dir", "C:\\mooctest\\projects\\3933\\48192\\Tarjan"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\Administrator"); 
    java.lang.System.setProperty("user.language", "zh"); 
    java.lang.System.setProperty("user.name", "Administrator"); 
    java.lang.System.setProperty("user.timezone", "Asia/Shanghai"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DenseWeightedGraph_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.AllEqualOrdering",
      "com.google.common.collect.RegularContiguousSet",
      "com.google.common.base.Objects$ToStringHelper$ValueHolder",
      "com.google.common.base.Joiner$1",
      "com.google.common.base.Joiner$2",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableEnumMap",
      "com.google.common.collect.EmptyImmutableSortedSet",
      "com.google.common.collect.Collections2",
      "net.mooctest.DenseWeightedGraph",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "com.google.common.collect.RegularContiguousSet$2",
      "com.google.common.collect.RegularContiguousSet$1",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.google.common.base.Objects",
      "com.google.common.collect.Maps$9",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.NullsLastOrdering",
      "com.google.common.collect.ImmutableSet$ArrayImmutableSet",
      "com.google.common.base.Function",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ComparatorOrdering",
      "com.google.common.collect.DiscreteDomain$IntegerDomain",
      "com.google.common.collect.Range",
      "com.google.common.base.Objects$ToStringHelper",
      "net.mooctest.SparseWeightedGraph",
      "com.google.common.collect.ByFunctionOrdering",
      "com.google.common.collect.SortedMapDifference",
      "com.google.common.collect.ImmutableCollection$EmptyImmutableCollection",
      "com.google.common.collect.RegularImmutableSet",
      "net.mooctest.Edge$EdgeBuilder",
      "com.google.common.collect.DiscreteDomain$LongDomain",
      "com.google.common.base.Predicate",
      "com.google.common.collect.ExplicitOrdering",
      "com.google.common.collect.LexicographicalOrdering",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "com.github.javaparser.utils.Utils",
      "com.google.common.collect.Lists$2",
      "com.google.common.collect.Cut$AboveValue",
      "com.google.common.collect.Lists$1",
      "com.google.common.base.Joiner",
      "com.google.common.collect.Range$2",
      "com.google.common.collect.Range$3",
      "com.google.common.collect.NullsFirstOrdering",
      "com.google.common.collect.ContiguousSet",
      "com.google.common.collect.Range$1",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.Multiset",
      "com.google.common.collect.DiscreteDomain$BigIntegerDomain",
      "com.google.common.collect.RegularImmutableAsList",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.collect.Cut$BelowValue",
      "com.google.common.collect.CompoundOrdering",
      "com.google.common.collect.EmptyImmutableSet",
      "com.google.common.collect.AbstractSequentialIterator",
      "com.github.javaparser.javadoc.JavadocBlockTag$Type",
      "com.google.common.collect.Lists$Partition",
      "net.mooctest.WeightedGraph",
      "com.google.common.collect.Lists",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ReverseOrdering",
      "com.google.common.collect.UsingToStringOrdering",
      "com.google.common.collect.DiscreteDomain",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.github.javaparser.javadoc.JavadocBlockTag",
      "com.google.common.collect.EmptyContiguousSet",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "com.google.common.collect.Cut",
      "com.google.common.collect.ImmutableSortedSet",
      "net.mooctest.Edge",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.Cut$BelowAll",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.common.collect.ReverseNaturalOrdering",
      "com.google.common.collect.Maps",
      "net.mooctest.Weighted",
      "com.google.common.collect.MapDifference",
      "com.google.common.collect.DescendingImmutableSortedSet",
      "com.google.common.collect.Maps$EntryTransformer",
      "com.google.common.collect.Ordering",
      "com.google.common.collect.SortedIterable",
      "com.google.common.collect.NaturalOrdering",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.ImmutableSortedSetFauxverideShim",
      "com.google.common.collect.Cut$AboveAll",
      "com.google.common.collect.RegularImmutableSortedSet"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DenseWeightedGraph_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "net.mooctest.WeightedGraph",
      "net.mooctest.DenseWeightedGraph",
      "com.google.common.base.Joiner",
      "com.google.common.base.Preconditions",
      "com.google.common.base.Joiner$1",
      "com.google.common.collect.Collections2",
      "com.google.common.collect.Cut",
      "com.google.common.collect.Cut$BelowAll",
      "com.google.common.collect.Cut$AboveAll",
      "com.google.common.collect.DiscreteDomain",
      "com.google.common.collect.DiscreteDomain$IntegerDomain",
      "com.google.common.collect.Lists",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.common.collect.Maps",
      "com.google.common.collect.Range$1",
      "com.google.common.collect.Range$2",
      "com.google.common.collect.Ordering",
      "com.google.common.collect.Range$3",
      "com.google.common.collect.Range",
      "com.google.common.collect.Cut$BelowValue",
      "com.google.common.primitives.Booleans",
      "com.google.common.collect.ImmutableCollection$EmptyImmutableCollection",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.ImmutableSortedSetFauxverideShim",
      "com.google.common.collect.NaturalOrdering",
      "com.google.common.collect.EmptyImmutableSortedSet",
      "com.google.common.collect.ImmutableSortedSet",
      "com.google.common.collect.ContiguousSet",
      "com.google.common.collect.EmptyContiguousSet",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$2",
      "com.google.common.collect.Iterators",
      "com.github.javaparser.ast.NodeList",
      "com.google.common.collect.RegularContiguousSet",
      "com.google.common.collect.AbstractSequentialIterator",
      "com.google.common.collect.RegularContiguousSet$1",
      "com.github.javaparser.JavaToken",
      "com.github.javaparser.TokenRange",
      "com.github.javaparser.printer.PrettyPrinter",
      "com.github.javaparser.printer.PrettyPrinterConfiguration",
      "com.github.javaparser.ast.DataKey",
      "com.github.javaparser.ast.Node$1",
      "com.github.javaparser.ast.Node",
      "com.github.javaparser.ast.type.Type",
      "com.github.javaparser.ast.type.ReferenceType",
      "com.github.javaparser.ast.type.TypeParameter",
      "com.github.javaparser.ast.expr.SimpleName",
      "com.github.javaparser.ast.Node$Parsedness",
      "com.github.javaparser.ast.observer.ObservableProperty$Type",
      "com.github.javaparser.ast.observer.ObservableProperty",
      "com.github.javaparser.ast.body.Parameter",
      "com.github.javaparser.ast.expr.Expression",
      "com.github.javaparser.ast.expr.AnnotationExpr",
      "com.github.javaparser.ast.expr.SingleMemberAnnotationExpr",
      "com.github.javaparser.ast.expr.Name",
      "com.github.javaparser.ast.expr.LiteralExpr",
      "com.github.javaparser.ast.expr.LiteralStringValueExpr",
      "com.github.javaparser.ast.expr.StringLiteralExpr",
      "com.github.javaparser.ast.ArrayCreationLevel",
      "com.github.javaparser.ast.expr.NormalAnnotationExpr",
      "com.github.javaparser.ParserConfiguration",
      "com.github.javaparser.ast.validator.Validators",
      "com.github.javaparser.ast.validator.Java1_0Validator",
      "com.github.javaparser.ast.validator.Java1_1Validator",
      "com.github.javaparser.ast.validator.Java1_2Validator",
      "com.github.javaparser.ast.validator.Java1_3Validator",
      "com.github.javaparser.ast.validator.Java1_4Validator",
      "com.github.javaparser.ast.validator.Java5Validator",
      "com.github.javaparser.ast.validator.Java6Validator",
      "com.github.javaparser.ast.validator.Java7Validator",
      "com.github.javaparser.ast.validator.Java8Validator",
      "com.github.javaparser.ast.validator.chunks.CommonValidators",
      "com.github.javaparser.ast.validator.SingleNodeTypeValidator",
      "com.github.javaparser.ast.validator.SimpleValidator",
      "com.github.javaparser.ast.validator.TreeVisitorValidator",
      "com.github.javaparser.ast.visitor.VoidVisitorAdapter",
      "com.github.javaparser.ast.validator.VisitorValidator",
      "com.github.javaparser.ast.validator.chunks.ModifierValidator",
      "com.github.javaparser.ast.validator.chunks.NoBinaryIntegerLiteralsValidator",
      "com.github.javaparser.ast.validator.chunks.NoUnderscoresInIntegerLiteralsValidator",
      "com.github.javaparser.ast.validator.ReservedKeywordValidator",
      "com.github.javaparser.utils.CodeGenerationUtils",
      "com.github.javaparser.ast.validator.Java9Validator",
      "com.github.javaparser.ast.validator.Java10Validator",
      "com.github.javaparser.ast.validator.Java11Validator",
      "com.github.javaparser.ast.validator.chunks.UnderscoreKeywordValidator",
      "com.github.javaparser.ast.validator.chunks.VarValidator",
      "com.github.javaparser.version.PostProcessors",
      "com.github.javaparser.version.Java10PostProcessor",
      "com.github.javaparser.version.Java11PostProcessor",
      "com.github.javaparser.ParserConfiguration$LanguageLevel",
      "com.github.javaparser.JavaParser",
      "com.github.javaparser.ParseStart",
      "com.github.javaparser.Providers",
      "com.github.javaparser.StringProvider",
      "com.github.javaparser.GeneratedJavaParserBase",
      "com.github.javaparser.GeneratedJavaParser",
      "com.github.javaparser.GeneratedJavaParser$LookaheadSuccess",
      "com.github.javaparser.SimpleCharStream",
      "com.github.javaparser.GeneratedJavaParserTokenManager",
      "com.github.javaparser.ast.comments.CommentsCollection",
      "com.github.javaparser.TokenBase",
      "com.github.javaparser.Token",
      "com.github.javaparser.GeneratedJavaParser$JJCalls",
      "com.github.javaparser.Range",
      "com.github.javaparser.Position",
      "com.github.javaparser.TokenTypes",
      "com.github.javaparser.JavaToken$Category",
      "com.github.javaparser.ParseResult",
      "com.github.javaparser.CommentsInserter",
      "com.github.javaparser.ast.validator.ProblemReporter",
      "com.github.javaparser.ast.Node$TreeTraversal",
      "com.github.javaparser.ast.Node$ObserverRegistrationMode",
      "com.github.javaparser.ast.Node$2",
      "com.github.javaparser.ast.Node$PreOrderIterator",
      "com.github.javaparser.metamodel.BaseNodeMetaModel",
      "com.github.javaparser.metamodel.NodeMetaModel",
      "com.github.javaparser.metamodel.BodyDeclarationMetaModel",
      "com.github.javaparser.metamodel.CallableDeclarationMetaModel",
      "com.github.javaparser.metamodel.StatementMetaModel",
      "com.github.javaparser.metamodel.ExpressionMetaModel",
      "com.github.javaparser.metamodel.TypeMetaModel",
      "com.github.javaparser.metamodel.AnnotationExprMetaModel",
      "com.github.javaparser.metamodel.TypeDeclarationMetaModel",
      "com.github.javaparser.metamodel.ReferenceTypeMetaModel",
      "com.github.javaparser.metamodel.LiteralExprMetaModel",
      "com.github.javaparser.metamodel.LiteralStringValueExprMetaModel",
      "com.github.javaparser.metamodel.StringLiteralExprMetaModel",
      "com.github.javaparser.metamodel.ModuleDeclarationMetaModel",
      "com.github.javaparser.metamodel.ModuleStmtMetaModel",
      "com.github.javaparser.metamodel.ArrayCreationLevelMetaModel",
      "com.github.javaparser.metamodel.CompilationUnitMetaModel",
      "com.github.javaparser.metamodel.PackageDeclarationMetaModel",
      "com.github.javaparser.metamodel.AnnotationDeclarationMetaModel",
      "com.github.javaparser.metamodel.AnnotationMemberDeclarationMetaModel",
      "com.github.javaparser.metamodel.ClassOrInterfaceDeclarationMetaModel",
      "com.github.javaparser.metamodel.ConstructorDeclarationMetaModel",
      "com.github.javaparser.metamodel.EnumConstantDeclarationMetaModel",
      "com.github.javaparser.metamodel.EnumDeclarationMetaModel",
      "com.github.javaparser.metamodel.FieldDeclarationMetaModel",
      "com.github.javaparser.metamodel.InitializerDeclarationMetaModel",
      "com.github.javaparser.metamodel.MethodDeclarationMetaModel",
      "com.github.javaparser.metamodel.ParameterMetaModel",
      "com.github.javaparser.metamodel.ReceiverParameterMetaModel",
      "com.github.javaparser.metamodel.VariableDeclaratorMetaModel",
      "com.github.javaparser.metamodel.CommentMetaModel",
      "com.github.javaparser.metamodel.BlockCommentMetaModel",
      "com.github.javaparser.metamodel.JavadocCommentMetaModel",
      "com.github.javaparser.metamodel.LineCommentMetaModel",
      "com.github.javaparser.metamodel.ArrayAccessExprMetaModel",
      "com.github.javaparser.metamodel.ArrayCreationExprMetaModel",
      "com.github.javaparser.metamodel.ArrayInitializerExprMetaModel",
      "com.github.javaparser.metamodel.AssignExprMetaModel",
      "com.github.javaparser.metamodel.BinaryExprMetaModel",
      "com.github.javaparser.metamodel.BooleanLiteralExprMetaModel",
      "com.github.javaparser.metamodel.CastExprMetaModel",
      "com.github.javaparser.metamodel.CharLiteralExprMetaModel",
      "com.github.javaparser.metamodel.ClassExprMetaModel",
      "com.github.javaparser.metamodel.ConditionalExprMetaModel",
      "com.github.javaparser.metamodel.DoubleLiteralExprMetaModel",
      "com.github.javaparser.metamodel.EnclosedExprMetaModel",
      "com.github.javaparser.metamodel.FieldAccessExprMetaModel",
      "com.github.javaparser.metamodel.InstanceOfExprMetaModel",
      "com.github.javaparser.metamodel.IntegerLiteralExprMetaModel",
      "com.github.javaparser.metamodel.LambdaExprMetaModel",
      "com.github.javaparser.metamodel.LongLiteralExprMetaModel",
      "com.github.javaparser.metamodel.MarkerAnnotationExprMetaModel",
      "com.github.javaparser.metamodel.MemberValuePairMetaModel",
      "com.github.javaparser.metamodel.MethodCallExprMetaModel",
      "com.github.javaparser.metamodel.MethodReferenceExprMetaModel",
      "com.github.javaparser.metamodel.NameExprMetaModel",
      "com.github.javaparser.metamodel.NameMetaModel",
      "com.github.javaparser.metamodel.NormalAnnotationExprMetaModel",
      "com.github.javaparser.metamodel.NullLiteralExprMetaModel",
      "com.github.javaparser.metamodel.ObjectCreationExprMetaModel",
      "com.github.javaparser.metamodel.SimpleNameMetaModel",
      "com.github.javaparser.metamodel.SingleMemberAnnotationExprMetaModel",
      "com.github.javaparser.metamodel.SuperExprMetaModel",
      "com.github.javaparser.metamodel.ThisExprMetaModel",
      "com.github.javaparser.metamodel.TypeExprMetaModel",
      "com.github.javaparser.metamodel.UnaryExprMetaModel",
      "com.github.javaparser.metamodel.VariableDeclarationExprMetaModel",
      "com.github.javaparser.metamodel.ImportDeclarationMetaModel",
      "com.github.javaparser.metamodel.AssertStmtMetaModel",
      "com.github.javaparser.metamodel.BlockStmtMetaModel",
      "com.github.javaparser.metamodel.BreakStmtMetaModel",
      "com.github.javaparser.metamodel.CatchClauseMetaModel",
      "com.github.javaparser.metamodel.ContinueStmtMetaModel",
      "com.github.javaparser.metamodel.DoStmtMetaModel",
      "com.github.javaparser.metamodel.EmptyStmtMetaModel",
      "com.github.javaparser.metamodel.ExplicitConstructorInvocationStmtMetaModel",
      "com.github.javaparser.metamodel.ExpressionStmtMetaModel",
      "com.github.javaparser.metamodel.ForeachStmtMetaModel",
      "com.github.javaparser.metamodel.ForStmtMetaModel",
      "com.github.javaparser.metamodel.IfStmtMetaModel",
      "com.github.javaparser.metamodel.LabeledStmtMetaModel",
      "com.github.javaparser.metamodel.ReturnStmtMetaModel",
      "com.github.javaparser.metamodel.SwitchEntryStmtMetaModel",
      "com.github.javaparser.metamodel.SwitchStmtMetaModel",
      "com.github.javaparser.metamodel.SynchronizedStmtMetaModel",
      "com.github.javaparser.metamodel.ThrowStmtMetaModel",
      "com.github.javaparser.metamodel.TryStmtMetaModel",
      "com.github.javaparser.metamodel.LocalClassDeclarationStmtMetaModel",
      "com.github.javaparser.metamodel.WhileStmtMetaModel",
      "com.github.javaparser.metamodel.UnparsableStmtMetaModel",
      "com.github.javaparser.metamodel.ArrayTypeMetaModel",
      "com.github.javaparser.metamodel.ClassOrInterfaceTypeMetaModel",
      "com.github.javaparser.metamodel.IntersectionTypeMetaModel",
      "com.github.javaparser.metamodel.PrimitiveTypeMetaModel",
      "com.github.javaparser.metamodel.TypeParameterMetaModel",
      "com.github.javaparser.metamodel.UnionTypeMetaModel",
      "com.github.javaparser.metamodel.UnknownTypeMetaModel",
      "com.github.javaparser.metamodel.VoidTypeMetaModel",
      "com.github.javaparser.metamodel.WildcardTypeMetaModel",
      "com.github.javaparser.metamodel.VarTypeMetaModel",
      "com.github.javaparser.metamodel.ModuleRequiresStmtMetaModel",
      "com.github.javaparser.metamodel.ModuleExportsStmtMetaModel",
      "com.github.javaparser.metamodel.ModuleProvidesStmtMetaModel",
      "com.github.javaparser.metamodel.ModuleUsesStmtMetaModel",
      "com.github.javaparser.metamodel.ModuleOpensStmtMetaModel",
      "com.github.javaparser.metamodel.PropertyMetaModel",
      "com.github.javaparser.metamodel.JavaParserMetaModel",
      "com.github.javaparser.Problem",
      "com.github.javaparser.ast.visitor.EqualsVisitor",
      "net.mooctest.Edge",
      "net.mooctest.Edge$EdgeBuilder",
      "net.mooctest.Weighted",
      "com.google.common.base.Objects",
      "com.google.common.base.Objects$ToStringHelper",
      "com.google.common.base.Objects$ToStringHelper$ValueHolder",
      "com.github.javaparser.ast.type.PrimitiveType",
      "com.github.javaparser.ast.body.ReceiverParameter",
      "com.github.javaparser.ast.expr.MarkerAnnotationExpr",
      "com.github.javaparser.ast.expr.ArrayAccessExpr",
      "com.github.javaparser.ast.expr.NameExpr",
      "com.github.javaparser.ast.expr.IntegerLiteralExpr",
      "com.github.javaparser.printer.PrettyPrintVisitor",
      "com.github.javaparser.printer.SourcePrinter",
      "com.github.javaparser.utils.PositionUtils",
      "com.github.javaparser.ast.visitor.ObjectIdentityHashCodeVisitor",
      "com.github.javaparser.ast.stmt.Statement",
      "com.github.javaparser.ast.stmt.LocalClassDeclarationStmt",
      "com.github.javaparser.ast.stmt.BreakStmt",
      "com.github.javaparser.ast.stmt.AssertStmt",
      "com.github.javaparser.ast.expr.BooleanLiteralExpr",
      "com.github.javaparser.ast.stmt.UnparsableStmt",
      "com.github.javaparser.ast.visitor.CloneVisitor",
      "com.github.javaparser.ast.comments.Comment",
      "com.github.javaparser.ast.comments.BlockComment",
      "com.github.javaparser.ast.type.ClassOrInterfaceType",
      "com.github.javaparser.ast.body.BodyDeclaration",
      "com.github.javaparser.ast.body.AnnotationMemberDeclaration",
      "com.github.javaparser.ast.body.TypeDeclaration",
      "com.github.javaparser.ast.body.EnumDeclaration",
      "com.github.javaparser.ast.expr.BinaryExpr",
      "com.github.javaparser.ast.type.UnknownType",
      "com.github.javaparser.ast.visitor.HashCodeVisitor",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.collect.EmptyImmutableBiMap",
      "net.mooctest.Edge$2",
      "com.github.javaparser.ast.comments.LineComment",
      "com.github.javaparser.ast.body.CallableDeclaration",
      "com.github.javaparser.ast.body.MethodDeclaration",
      "com.github.javaparser.ast.stmt.BlockStmt",
      "net.mooctest.Edge$4",
      "com.github.javaparser.ast.body.AnnotationDeclaration",
      "com.github.javaparser.ast.expr.DoubleLiteralExpr",
      "com.github.javaparser.ast.expr.LongLiteralExpr",
      "net.mooctest.Edge$3",
      "net.mooctest.SparseWeightedGraph",
      "com.google.common.collect.EmptyImmutableSet",
      "net.mooctest.Edge$1",
      "com.github.javaparser.ast.visitor.NoCommentHashCodeVisitor",
      "com.github.javaparser.GeneratedJavaParserConstants",
      "com.github.javaparser.ast.observer.PropagatingAstObserver",
      "com.github.javaparser.ast.observer.PropagatingAstObserver$1",
      "com.github.javaparser.ast.expr.AssignExpr",
      "com.github.javaparser.ast.stmt.ExpressionStmt",
      "com.github.javaparser.ast.stmt.WhileStmt",
      "com.github.javaparser.ast.body.EnumConstantDeclaration",
      "com.github.javaparser.ast.expr.ArrayCreationExpr",
      "com.github.javaparser.ast.expr.ArrayInitializerExpr",
      "com.github.javaparser.ast.CompilationUnit",
      "com.github.javaparser.ast.PackageDeclaration",
      "com.google.common.collect.ComparisonChain$1",
      "com.google.common.collect.ComparisonChain$InactiveComparisonChain",
      "com.google.common.collect.ComparisonChain",
      "com.google.common.primitives.Ints",
      "com.github.javaparser.ast.expr.LambdaExpr",
      "com.github.javaparser.ast.stmt.ReturnStmt",
      "com.github.javaparser.ast.expr.ThisExpr"
    );
  }
}
