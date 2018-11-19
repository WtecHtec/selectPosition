import request from '@/utils/request'
export function getcity (data) {
  return request({
    url: '/seriver/position/getcity',
    method: 'post',
    data
  })
}
export function getarea (data) {
  return request({
    url: '/seriver/position/getarea?city=' + data,
    method: 'post'
  })
}
export function getstreet (data) {
  return request({
    url: '/seriver/position/getstreet?area=' + data,
    method: 'post'
  })
}
