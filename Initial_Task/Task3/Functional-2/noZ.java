public List<String> noZ(List<String> strings) {
    return strings.stream().filter(n->!n.contains("z")).collect(Collectors.toList());
  }
  