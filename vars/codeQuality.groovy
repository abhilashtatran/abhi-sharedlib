def call() {
//   recordIssues(tools: [findBugs(pattern: '**/target/site/findbugs/findbugsXml.xml', useRankAsPriority: true)])
     recordIssues(tools: [pmdParser(pattern: '**/pmd.xml')])
}
