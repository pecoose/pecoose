for (int i3 = 0; i3 < apkInfo.intentFilters.size(); i3++) {
  lVar = apkInfo.intentFilters.get(i3);
  if (lVar.f24167d.match(this.a.getAction(), 
                         this.a.getType(), 
                         this.a.getScheme(), 
                         this.a.getData(), 
                         this.a.getCategories(), "PIF") >= 0) {
    Class<?> loadClass = apkInfo.classLoader.loadClass(lVar.b);
  }
}

