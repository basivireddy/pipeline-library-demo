def call() {
    sh 'python3 ${WORKSPACE}@libs/pipeline-library-demo/resources/scripts/hello.py'
}
