//package net.mooctest;
//
//import org.junit.Test;
//import spoon.Launcher;
//import spoon.reflect.CtModel;
//import spoon.reflect.declaration.CtClass;
//import spoon.reflect.declaration.CtMethod;
//import spoon.reflect.visitor.filter.TypeFilter;
//
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class TestCaseGenerator {
//    private static final String STOP_TOKEN = "scaffolding";
//    private ArrayList<CtMethod> ctMethods = new ArrayList<CtMethod>();
//
//    private void process(String targetFolder, String outputPath) throws IOException {
//        File target = new File(targetFolder);
//        if (!target.exists() || !target.isDirectory()) {
//            System.err.println(String.format("%s does not exist.", target));
//            return;
//        }
//        for (File testSuite : target.listFiles()) {
//            String fileName = testSuite.getName();
//            if (!fileName.endsWith(".java") || fileName.contains(STOP_TOKEN))
//                continue;
//            System.out.println(String.format("Handling %s", testSuite.getName()));
//            handleSingleFile(testSuite.getAbsolutePath());
//        }
//        writeFile(ctMethods, outputPath);
//    }
//
//    private void writeFile(ArrayList<CtMethod> ctMethods, String outputPath) throws IOException {
//        try {
//            FileWriter fileWriter = new FileWriter(outputPath);
//            for (CtMethod ctMethod : ctMethods) {
//                fileWriter.write(ctMethod.toString() + "\n");
//            }
//            fileWriter.close();
//        } catch (Exception e) {
//
//        }
//    }
//
//    private void handleSingleFile(String filePath) {
//        Launcher launcher = new Launcher();
//        launcher.addInputResource(filePath);
//        CtModel model = launcher.buildModel();
//        List<CtClass> clazzes = model.getElements(new TypeFilter(CtClass.class));
//        assert clazzes.size() == 1;
//        CtClass clazz = clazzes.get(0);
//        String name = clazz.getSimpleName();
//        for (Object ctMethod : clazz.getAllMethods()) {
//            ctMethod = (CtMethod) ctMethod;
//            String methodName = ((CtMethod) ctMethod).getSimpleName();
//            if (!methodName.contains("test"))
//                continue;
//            ((CtMethod) ctMethod).setSimpleName(name + methodName);
//            ctMethods.add((CtMethod) ctMethod);
//        }
//
//    }
//
//    @Test
//    public void testProcess() throws IOException {
//        process("src/evo/net/mooctest", "evotest");
//    }
//}
