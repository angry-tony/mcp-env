node ('python'){
  stage('Run nightly tests'){
    build(
          job: 'create-mcp-env',
          parameters: [
              string(name: 'STACK_NAME', value: 'night-core-cicd-openstack-stacklight-ovs'),
              string(name: 'OS_PROJECT_NAME', value: 'mcp-scale-dev'),
              string(name: 'STACK_INSTALL', value: 'core,cicd,openstack,stacklight,ovs'),
          ],
          propagate: true,
          wait: true,
      )
  }
}
