modules = {
    // Resources for your custom UI Set
    'ui.Bootstrap' {
        dependsOn 'jquery', 'bootstrap', 'bootstrap-js'
        
        resource id:'styling', url:[plugin:'bootstrap-ui', dir:'css', file:'ui-styling.css']
        resource id:'hooks', url:[plugin:'bootstrap-ui', dir:'js', file:'bootstrap-hooks.js']
    }
}
