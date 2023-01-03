def quality() {
  recordIssues(tools: [findBugs(pattern: '**/target/site/findbugs/findbugsXml.xml', useRankAsPriority: true)])
}
