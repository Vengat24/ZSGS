public List<String> noYY(List<String> strings) {
    return strings.stream().map(n->n+"y").filter(n->!n.contains("yy")).collect(Collectors.toList());
  }
  