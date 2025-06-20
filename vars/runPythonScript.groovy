def call(String firstArg, String secondArg) {
    sh """
        python3 ${WORKSPACE}@libs/pipeline-library-demo/resources/scripts/my_script.py ${firstArg} ${secondArg}
    """
}
