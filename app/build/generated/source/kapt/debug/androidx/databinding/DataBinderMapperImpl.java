package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new sk.uniza.fri.autoskola.DataBinderMapperImpl());
  }
}
