package design_patterns.singleton;

public class SingletonPatternExampleUsage {
    public static void main(String[] args) {
        // Step 1: Get the single instance of ProjectSettings
        ProjectSettings projectSettings = ProjectSettings.getInstance();

        // Step 2: Set and retrieve project settings
        projectSettings.setProjectName("My Project");

        // Step 3: Retrieve the project name
        String projectName = projectSettings.getProjectName();

        // Step 4: Explain the usage
        System.out.println("Project Name: " + projectName);
        System.out.println(
                "Singleton Design Pattern is used to ensure that only one instance of ProjectSettings exists.");
        System.out.println("Project settings can be set and retrieved using the single instance.");
    }
}
