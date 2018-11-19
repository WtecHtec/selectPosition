<template>
<div>
  <el-form inline>
    <el-form-item label="市">
      <el-select v-model="city" clearable  filterable placeholder="请选择" @change="getarea">
    <el-option
      v-for="item in citys"
      :key="item.id"
      :label="item.areaName"
      :value="item.id">
    </el-option>
  </el-select>
    </el-form-item>

     <el-form-item label="区">
      <el-select v-model="area" clearable  filterable placeholder="请选择" @change="getstreet">
    <el-option
      v-for="item in areas"
      :key="item.id"
      :label="item.areaName"
      :value="item.id">
    </el-option>
  </el-select>
    </el-form-item>

     <el-form-item label="街道">
      <el-select v-model="street" clearable  filterable placeholder="请选择">
    <el-option
      v-for="item in streets"
      :key="item.id"
      :label="item.areaName"
      :value="item.id">
    </el-option>
  </el-select>
    </el-form-item>
  </el-form>
</div>
</template>
<script>
import { getcity, getstreet, getarea } from '@/api/position'
export default {
  data () {
    return {
      street: undefined,
      streets: [],
      area: undefined,
      areas: [],
      city: undefined,
      citys: [],
      data: {}
    }
  },
  created () {
    this.feachcitydata()
  },
  methods: {
    getstreet () {
      if (this.area === '') {
        this.street = undefined
        this.streets = []
      } else {
        this.feachstreetdata()
      }
    },
    getarea () {
      console.log(this.city)
      if (this.city === '') {
        this.area = undefined
        this.areas = []
        this.street = undefined
        this.streets = []
      } else {
        this.feachareadata()
      }
    },
    feachcitydata () {
      getcity(this.data).then(response => {
        console.log(response.data)
        this.citys = response.data.responseData
      })
    },
    feachareadata () {
      getarea(this.city).then(response => {
        console.log(response.data)
        this.areas = response.data.responseData
      })
    },
    feachstreetdata () {
      getstreet(this.area).then(response => {
        console.log(response.data)
        this.streets = response.data.responseData
      })
    }
  }
}
</script>
