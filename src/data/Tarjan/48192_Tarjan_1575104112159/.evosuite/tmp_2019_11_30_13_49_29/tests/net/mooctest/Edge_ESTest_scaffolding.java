/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Nov 30 05:57:03 GMT 2019
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
public class Edge_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "net.mooctest.Edge"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Edge_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.base.Objects$ToStringHelper$ValueHolder",
      "com.google.common.base.Joiner$1",
      "com.google.common.collect.Hashing",
      "com.google.common.base.Joiner$2",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableEnumMap",
      "com.google.common.collect.Collections2",
      "com.google.common.collect.PeekingIterator",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.google.common.base.Objects",
      "com.google.common.collect.Iterators$6",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.Maps$9",
      "com.google.common.collect.Iterators$7",
      "com.google.common.collect.ImmutableMapKeySet",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.base.Function",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.RegularImmutableBiMap",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$2",
      "com.google.common.base.Objects$ToStringHelper",
      "com.google.common.collect.Iterators$3",
      "com.google.common.collect.SortedMapDifference",
      "net.mooctest.Edge$EdgeBuilder",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.Iterators$12",
      "com.google.common.collect.Iterators$11",
      "com.google.common.collect.EmptyImmutableBiMap",
      "com.google.common.base.Predicate",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "com.google.common.collect.Lists$2",
      "net.mooctest.Edge$4",
      "net.mooctest.Edge$3",
      "net.mooctest.Edge$2",
      "com.google.common.collect.Lists$1",
      "com.google.common.base.Joiner",
      "com.google.common.collect.Iterables$3",
      "com.google.common.collect.Iterables",
      "net.mooctest.Edge$1",
      "com.google.common.collect.Multiset",
      "com.google.common.collect.Iterators$14",
      "com.google.common.collect.Iterators$13",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.RegularImmutableMap$LinkedEntry",
      "com.google.common.collect.ImmutableMapEntrySet",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.collect.Lists$Partition",
      "com.google.common.collect.Lists",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.SingletonImmutableBiMap",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.RegularImmutableMap$TerminalEntry",
      "com.google.common.collect.ImmutableMap$1MapViewOfValuesAsSingletonSets",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "net.mooctest.Edge",
      "com.google.common.collect.RegularImmutableMap$EntrySet",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.collect.Maps",
      "com.google.common.collect.MapDifference",
      "com.google.common.collect.Maps$EntryTransformer",
      "com.google.common.collect.RegularImmutableMap$NonTerminalEntry",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.Iterators$MergingIterator",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.ImmutableMapValues"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Edge_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "net.mooctest.Edge",
      "net.mooctest.Edge$EdgeBuilder",
      "net.mooctest.Edge$1",
      "net.mooctest.Edge$2",
      "net.mooctest.Edge$3",
      "net.mooctest.Edge$4",
      "com.google.common.base.Objects",
      "com.google.common.base.Objects$ToStringHelper",
      "com.google.common.base.Objects$ToStringHelper$ValueHolder",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.collect.Lists",
      "com.google.common.base.Joiner",
      "com.google.common.base.Joiner$1",
      "com.google.common.collect.Collections2",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.common.collect.Maps",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.collect.SingletonImmutableBiMap",
      "com.google.common.collect.Iterables",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$2",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.EmptyImmutableBiMap",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.RegularImmutableMap$TerminalEntry",
      "com.google.common.collect.RegularImmutableMap$NonTerminalEntry"
    );
  }
}