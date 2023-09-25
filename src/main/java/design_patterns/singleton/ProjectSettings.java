package design_patterns.singleton;

/**
 * ProjectSettings is a Singleton class that manages project settings.
 * It ensures that only one instance of ProjectSettings is created.
 */
public class ProjectSettings {
    // Step 1: Create a private static instance of ProjectSettings
    private static ProjectSettings instance;

    // Step 2: Create a private constructor to prevent external instantiation
    private ProjectSettings() {
        // Initialize project settings here
    }

    /**
     * Step 3: Create a public static method to provide access to the single
     * instance of the class.
     * This method initializes the instance if it doesn't exist and returns the
     * existing instance otherwise.
     *
     * @return The single instance of ProjectSettings
     */
    public static ProjectSettings getInstance() {
        if (instance == null) {
            instance = new ProjectSettings();
        }
        return instance;
    }

    /**
     * Step 4: Add methods and properties to manage project settings.
     * These methods can be used to set and retrieve project-related data.
     */
    public void setProjectName(String projectName) {
        // Set the project name
    }

    public String getProjectName() {
        // Get the project name
        return "Sample Project";
    }
}
